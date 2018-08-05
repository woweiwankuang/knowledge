package com.mytest.demo.designpattern.adapter;

import org.junit.Test;

public class AdapterTest {

    @Test
    public void adapterTest() {
        //聚合方式，这种方式的适配器称为 【对象适配器】
        //特点：把“被适配者”作为一个对象组合到适配器类中，以修改目标接口包装被适配者
        GBTwoPlus gbTwoPlus = new GBTwoPlus();
        ThreePlusIf threePlusIf = new TwoPlusAdapter(gbTwoPlus);
        NoteBook noteBook = new NoteBook(threePlusIf);
        noteBook.charge();

        System.out.println("****************************************");
        //继承方式，这种方式的适配器称为 【类适配器】
        //特点：通过多重继承不兼容接口，实现对目标接口的匹配，单一的为某个类而实现适配
        threePlusIf = new TwoPlusAdapterExtend();
        noteBook = new NoteBook(threePlusIf);
        noteBook.charge();
    }

}