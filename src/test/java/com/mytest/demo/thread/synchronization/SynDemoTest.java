package com.mytest.demo.thread.synchronization;

import org.junit.Test;

import static org.junit.Assert.*;

public class SynDemoTest {

    @Test
    public void test1() {
        final SynDemo t1 = new SynDemo();
        Thread ta = new Thread(t1::method1, "A");
        Thread tb = new Thread(t1::method1, "B");
        ta.start();
        tb.start();
        //两个线程运行了同一个对象t1的同一个public方法method1，这个方法在t1对象上同步，所以实现了同步的效果
    }

    @Test
    public void test2() {
        final SynDemo t1 = new SynDemo();
        Thread ta = new Thread(t1::method1, "A");
        Thread tb = new Thread(t1::method2, "B");
        ta.start();
        tb.start();
        //两个线程运行同一个对象t1的不同的方法method1和method2方法，但是这两个方法是使用同一个对象t1上进行同步的，所以实现同步的效果，侧面印证了这两种写法的一致性
    }

    @Test
    public void test3() {
        final SynDemo t1 = new SynDemo();
        final SynDemo t2 = new SynDemo();
        Thread ta = new Thread(t1::method3, "A");
        Thread tb = new Thread(t2::method3, "B");
        ta.start();
        tb.start();
        //这次两个线程运行了不同的类对象t1和t2的同一个方法method3，这个方法是在一个静态对象上同步，这个静态变量是在这个类的所有实例上共享的，所以也是达到了同步的效果
    }

    @Test
    public void test4() {
        final SynDemo t1 = new SynDemo();
        Thread ta = new Thread(t1::method2, "A");
        Thread tb = new Thread(t1::method3, "B");
        ta.start();
        tb.start();
        //这次是两个线程运行了同一个对象t1的method2和method3方法，这个方法分别在t1对象和SynMethod类的静态对象上同步，所以达到同步效果
    }

    @Test
    public void test5() {
        final SynDemo t1 = new SynDemo();
        final SynDemo t2 = new SynDemo();
        Thread ta = new Thread(t1::method4, "A");
        Thread tb = new Thread(t2::method4, "B");
        ta.start();
        tb.start();
        //两个线程运行了不同对象t1和t2的同一个方法method4，该方法是在SynMethod类上同步，实现了同步效果
    }

    @Test
    public void test6() {
        final SynDemo t1 = new SynDemo();
        Thread ta = new Thread(t1::method4, "A");
        Thread tb = new Thread(SynDemo::staticMethod, "B");
        ta.start();
        tb.start();
        //两个线程分别运行了对象t1的method4和静态方法staticMethod，这个两个方法都在SynMethod类上同步，实现了同步的效果。
    }

    @Test
    public void test7() {
        final SynDemo t1 = new SynDemo();
        final SynDemo t2 = new SynDemo();
        Thread ta = new Thread(t1::method4, "A");
        Thread tb = new Thread(t2::method3, "B");
        ta.start();
        tb.start();
        //这次两个线程运行了两个对象的method3和method4发放，这个两个方法分别在SynMethod类和SynMethod类的静态对象上同步，所以没有达到同步效果
    }

    @Test
    public void test8() {
        final SynDemo t1 = new SynDemo();
        final SynDemo t2 = new SynDemo();
        Thread ta = new Thread(t1::method4, "A");
        Thread tb = new Thread(t2::method2, "B");
        ta.start();
        tb.start();
        //这次两个线程运行了两个对象的method4和method2方法，这两个方法分别在SynMethod类和对象t2上同步，所以没有达到同步效果。
    }


    /**
     * 使用总结：虽然上面说的情况比较多，但是从同步对象的角度，同步的场景只用三个，
     * 一个是SynMethod实例（可以多个），SynMethod的静态对象（共享）和SynMethod类（一个），
     * 只要是在同一个对象上同步，这个对象可以是实例对象，可以是静态对象，可以是类对象，那么就可以实现同步效果，否则无法达到同步，这也与synchronized设计的初衷一致。
     */

}