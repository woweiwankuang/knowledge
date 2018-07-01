package com.mytest.demo.designpattern.template;

import org.junit.Test;

public class TemplateTest {

    @Test
    public void TemplateTest(){
        System.out.println("制备咖啡");
        RefreshBeverage b1 = new Coffee();
        b1.prepareBeverageTemplate();
        System.out.println("咖啡好了");

        System.out.println("*************");

        System.out.println("制备茶");
        RefreshBeverage b2 = new Tea();
        b2.prepareBeverageTemplate();
        System.out.println("茶好了");

    }
}