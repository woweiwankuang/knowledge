package com.mytest.demo.designpattern.abstractfactory;

public class MCFactory implements PackagingFruitFactory {
    @Override
    public Orange createOrange() {
        return new MCOrange();
    }

    @Override
    public Grape createGrape() {
        return new MCGrape();
    }
}
