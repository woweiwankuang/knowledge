package com.mytest.demo.designpattern.adapter;

public class NoteBook {

    private ThreePlusIf threePlusIf;

    public NoteBook(ThreePlusIf threePlusIf) {
        this.threePlusIf = threePlusIf;
    }

    /**
     * 使用插座充电
     */
    public void charge(){
        this.threePlusIf.powerWithThree();
    }
}
