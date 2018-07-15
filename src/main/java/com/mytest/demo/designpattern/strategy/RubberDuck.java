package com.mytest.demo.designpattern.strategy;

import com.mytest.demo.designpattern.strategy.impl.FlyNoWay;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super();
        super.setFlyingStragety(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("我全是黄，嘴巴红");
    }

    @Override
    public void quack(){
        System.out.println("嘎~嘎~嘎~");
    }
}
