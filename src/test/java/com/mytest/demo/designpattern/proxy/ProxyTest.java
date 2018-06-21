package com.mytest.demo.designpattern.proxy;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {

    @Test
    public void proxyTest(){
        //智能代引用理
//        Car car = new Car();
//        car.move();
        //静态代理2种方式（继承、复合），推荐复合

        //使用继承方式
//        Moveable m = new Car2();
//        m.move();
        //使用复合方式
//        Car car = new Car();
//        Moveable m1 = new Car3(car);
//        m1.move();

        //先日志后时间
//        Car car = new Car();
//        CarTimeProxy carTimeProxy = new CarTimeProxy(car);
//        CarLogProxy carLogProxy = new CarLogProxy(carTimeProxy);
//        carLogProxy.move();

        //先时间后日志
//        Car car = new Car();
//        CarLogProxy carLogProxy = new CarLogProxy(car);
//        CarTimeProxy carTimeProxy = new CarTimeProxy(carLogProxy);
//        carTimeProxy.move();

        //静态代理end

        //jdk动态代理(只能代理实现了接口的类
        Car car = new Car();
        InvocationHandler h = new TimeHandler(car);
        Class<?> cls = car.getClass();
        /**
         * loader 类加载器
         * interfaces 实现接口
         * h InvocationHandler 实现处理器
         *
         * jdk动态代理实现思路
         * 实现功能：通过Proxy的newProxyInstance返回代理对象
         * 1 声明一段源码（动态产生代理
         * 2 编译源码（jdk compiler api），产生新的类（代理类
         * 3 将这个类load到内存中，产生一个新的对象（代理对象
         * 4 return 代理对象
         */
        Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
        InvocationHandler h1 = new LogHandler(m);
        Moveable m1 = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h1);
        m1.move();

        //net.sf.cglib动态代理（针对类实现代理；对指定目标类产生一个子类，通过方法拦截技术拦截所有父类方法的调用


    }

}