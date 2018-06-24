package com.mytest.demo.designpattern.decorate;

import org.junit.Test;

public class DecoratorTest {

    @Test
    public void decoratorTest(){
        Girl g1 = new AmericanGirl();
        System.out.println(g1.getDescription());

        GoldenHair g2 = new GoldenHair(g1);
        System.out.println(g2.getDescription());

        Tall g3 = new Tall(g2);
        System.out.println(g3.getDescription());

        // 你也可以一步到位
        // Girl g = new Tall(new GoldenHair(new AmericanGirl()));
    }

}