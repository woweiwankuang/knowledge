package com.mytest.demo.designpattern.factory;

import org.junit.Test;

public class FactoryTest {
    @Test
    public void factoryTest() {
        //工厂模式
        FruitFactory fruitFactory = new FruitFactory();
        Fruit apple = fruitFactory.createFruit("apple");
        if (apple != null) {
            apple.display();
        }
    }
}