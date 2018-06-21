package com.mytest.demo.designpattern.singleton;
//懒汉
public class SkySingleton2 {

    public SkySingleton2() {
    }

    private static SkySingleton2 instance = new SkySingleton2();

    public static SkySingleton2 getInstance(){
        if (instance == null){
            instance = new SkySingleton2();
        }
        return instance;
    }
}
