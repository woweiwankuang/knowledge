package com.mytest.demo.designpattern.singleton;

public class SkySingletonTest {
    //饿汉模式，加载类时慢，使用时快，线程安全
    SkySingleton skySingleton = SkySingleton.instance;
    //懒汉模式，加载类时快，第一次使用慢，线程不安全
    SkySingleton2 skySingleton2 = SkySingleton2.getInstance();
}