package com.mytest.demo.designpattern.strategy.impl;

import com.mytest.demo.designpattern.strategy.FlyingStragety;

public class FlyNoWay implements FlyingStragety {
    @Override
    public void performFly() {
        System.out.println("我不会飞行");
    }
}
