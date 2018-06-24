package com.mytest.demo.designpattern.abstractfactory;

import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void abstractFactoryTest(){
        //抽象工厂模式
        PackagingFruitFactory factory = new MCFactory();
        Orange orange = factory.createOrange();
        orange.display();


        PackagingFruitFactory factory1 = new NYFactory();
        Grape grape = factory1.createGrape();
        grape.display();
    }

}