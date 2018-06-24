package com.mytest.demo.designpattern.abstractfactory;

public class NYFactory implements PackagingFruitFactory {
    @Override
    public Orange createOrange() {
        return new NYOrange();
    }

    @Override
    public Grape createGrape() {
        return new NYGrape();
    }
}
