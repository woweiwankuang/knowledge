package com.mytest.demo.designpattern.adapter;

/**
 * 二相转三相的插座适配器(聚合方式
 */
public class TwoPlusAdapter implements ThreePlusIf {

    private GBTwoPlus gbTwoPlus;

    public TwoPlusAdapter(GBTwoPlus gbTwoPlus) {
        this.gbTwoPlus = gbTwoPlus;
    }

    @Override
    public void powerWithThree() {
        System.out.println("通过转换");
        this.gbTwoPlus.powerWithTwo();
    }
}
