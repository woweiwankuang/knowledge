package com.mytest.demo.designpattern.decorate;

// 身材高大的特性
public class Tall extends GirlDecorator {

    private Girl girl;

    public Tall(Girl g) {
        girl = g;
    }

    @Override
    public String getDescription() {
        return girl.getDescription() + "+is very tall";
    }
}
