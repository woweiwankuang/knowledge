package com.mytest.demo.designpattern.factory;

public class FruitFactory {
    public Fruit createFruit(String key) {
        if ("apple".equals(key)) {
            return new Apple();
        } else if ("pair".equals(key)) {
            return new Pair();
        } else {
            return null;
        }
    }
}
