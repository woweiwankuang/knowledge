package com.mytest.demo.designpattern.observer.weather;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，它知道观察它的观察者，并提供（添加）和删除观察者的接口
 */
public class WeatherSubject {

    /**
     * 用来保存注册的观察者对象
     */
    private List<WeatherObserver> weatherObservers = new ArrayList<>();

    /**
     * 添加观察者
     * @param weatherObserver 观察者
     */
    public void attach(WeatherObserver weatherObserver){
        this.weatherObservers.add(weatherObserver);
    }

    /**
     * 删除观察者
     */
    public void deatach(WeatherObserver weatherObserver){
        this.weatherObservers.remove(weatherObserver);
    }

    /**
     * 通知所有注册的观察者
     */
    protected void notifyWeatherObservers(){
        for (WeatherObserver weatherObserver : this.weatherObservers) {
            weatherObserver.update(this);
        }
    }
}
