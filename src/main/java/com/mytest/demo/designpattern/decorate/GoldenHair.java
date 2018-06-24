package com.mytest.demo.designpattern.decorate;

//金发
public class GoldenHair extends GirlDecorator {

    private Girl girl;

    public GoldenHair(Girl g) {
        girl = g;
    }

    @Override
    public String getDescription() {
        return girl.getDescription() + "+with golden hair";
    }
}
