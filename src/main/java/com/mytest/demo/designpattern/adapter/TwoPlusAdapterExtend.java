package com.mytest.demo.designpattern.adapter;

/**
 * 采用继承方式的插座适配器
 */
public class TwoPlusAdapterExtend extends GBTwoPlus implements ThreePlusIf {
    @Override
    public void powerWithThree() {
        System.out.println("借助继承适配器");
        this.powerWithTwo();
    }
}
