package com.mytest.demo.designpattern.singleton;
//饿汉
public class SkySingleton {

    private SkySingleton() {
    }

    static SkySingleton instance = new SkySingleton();
}
