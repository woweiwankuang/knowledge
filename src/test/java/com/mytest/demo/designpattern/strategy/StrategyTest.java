package com.mytest.demo.designpattern.strategy;

import org.junit.Test;

public class StrategyTest {

    @Test
    public void StrategyTest(){
        //策略模式测试
        //Duck、MallardDuck、RedHeadDuck是旧代码，现在要提供飞行能力，增加了飞行接口
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.fly();
        System.out.println("****************************");
        //下面要添加新的鸭子，实现不同的飞行
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.fly();
    }

}