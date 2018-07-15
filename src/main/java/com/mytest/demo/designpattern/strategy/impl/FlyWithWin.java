package com.mytest.demo.designpattern.strategy.impl;

import com.mytest.demo.designpattern.strategy.FlyingStragety;

public class FlyWithWin implements FlyingStragety {
    @Override
    public void performFly() {
        System.out.println("振翅高飞");
    }
}
