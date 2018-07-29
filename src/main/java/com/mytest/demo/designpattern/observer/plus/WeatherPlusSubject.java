package com.mytest.demo.designpattern.observer.plus;

import java.util.ArrayList;
import java.util.List;

public abstract class WeatherPlusSubject {
    /**
     * 用来保存注册的观察者对象
     */
    protected List<PlusObserver> plusObservers = new ArrayList<>();

    /**
     * 添加观察者
     * @param plusObserver 观察者
     */
    public void attach(PlusObserver plusObserver){
        this.plusObservers.add(plusObserver);
    }

    /**
     * 删除观察者
     */
    public void deatach(PlusObserver plusObserver){
        this.plusObservers.remove(plusObserver);
    }

    /**
     * 通知所有注册的观察者
     */
    protected abstract void notifyWeatherObservers();

}
