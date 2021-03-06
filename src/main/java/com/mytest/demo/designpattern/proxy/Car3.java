package com.mytest.demo.designpattern.proxy;

public class Car3 implements Moveable {

    private Car car;

    public Car3(Car car) {
        super();
        this.car = car;
    }

    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶");
        this.car.move();
        long endTime = System.currentTimeMillis();
        System.out.println("汽车结束行驶，汽车行驶时间：" + (endTime - startTime) + "毫秒");
    }
}
