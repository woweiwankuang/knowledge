package com.mytest.demo.designpattern.observer.base;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，它知道观察它的观察者，并提供（添加）和删除观察者的接口
 */
public class Subject {
    /**
     * 用来保存注册的观察者对象
     */
    private List<Observer> observers = new ArrayList<>();

    /**
     * 添加观察者
     * @param observer 观察者
     */
    public void attach(Observer observer){
        this.observers.add(observer);
    }

    /**
     * 删除观察者
     */
    public void deatach(Observer observer){
        this.observers.remove(observer);
    }

    /**
     * 通知所有注册的观察者
     */
    protected void notifyObservers(){
        for (Observer observer : this.observers) {
            observer.update(this);
        }
    }
}
