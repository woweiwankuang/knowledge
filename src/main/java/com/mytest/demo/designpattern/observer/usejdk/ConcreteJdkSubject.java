package com.mytest.demo.designpattern.observer.usejdk;

import java.util.Observable;

//利用jdk观察者模式的具体实现类
public class ConcreteJdkSubject extends Observable {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        //天气情况有了，要通知所有的观察者
        //通知之前，需要先调用setChanged
        this.setChanged();
        //然后主动通知（这个方法有重载，有参数为推方式，无参数为拉方式
        this.notifyObservers();
    }
}
