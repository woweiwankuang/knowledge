package com.mytest.demo.designpattern.strategy;

import com.mytest.demo.designpattern.strategy.impl.FlyWithWin;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        super();
        super.setFlyingStragety(new FlyWithWin());
    }

    @Override
    public void display() {
        System.out.println("我的头是红色的");
    }


}
