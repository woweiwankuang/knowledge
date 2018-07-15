package com.mytest.demo.designpattern.strategy;

/**
 * 超类，所有鸭子都要继承此类
 * 抽象了鸭子的的行为：显示和鸣叫
 */
public abstract class Duck {

    private FlyingStragety flyingStragety;

    public void setFlyingStragety(FlyingStragety flyingStragety) {
        this.flyingStragety = flyingStragety;
    }

    /**
     * 鸭子发出叫声
     * 通用行为，由超类实现
     */
    public void quack(){
        System.out.println("嘎嘎嘎");
    }

    /**
     * 显示鸭子的外观
     * 鸭子外观各不相同，由子类实现
     */
    public abstract void display();

    public void fly() {
        this.flyingStragety.performFly();
    }
}
