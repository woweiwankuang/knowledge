package com.mytest.demo.designpattern.abstractfactory;
//包装水果工厂
public interface PackagingFruitFactory {

    Orange createOrange();

    Grape createGrape();
}
