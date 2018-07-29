package com.mytest.demo.designpattern.observer.usejdk;

import java.util.Observable;
import java.util.Observer;

public class ConcreteJdkObserver implements Observer {

    /**
     * 观察者名称
     */
    private String observerName;

    @Override
    public void update(Observable o, Object arg) {
        //推方式
        System.out.println(this.observerName + "收到了消息，消息是：" + arg);
        //拉方式
        System.out.println(this.observerName + "收到了消息，消息是：" + ((ConcreteJdkSubject) o).getContent());
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }
}
