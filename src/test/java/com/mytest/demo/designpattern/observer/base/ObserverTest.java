package com.mytest.demo.designpattern.observer.base;

import com.mytest.demo.designpattern.observer.plus.ConcretePlusObserver;
import com.mytest.demo.designpattern.observer.plus.ConcreteWeatherPlusSubject;
import com.mytest.demo.designpattern.observer.usejdk.ConcreteJdkObserver;
import com.mytest.demo.designpattern.observer.usejdk.ConcreteJdkSubject;
import com.mytest.demo.designpattern.observer.weather.ConcreteWeatherObserver;
import com.mytest.demo.designpattern.observer.weather.ConcreteWeatherSubject;
import org.junit.Test;

public class ObserverTest {

    @Test
    public void observerTest() {
        //创建目标
        ConcreteWeatherSubject weather = new ConcreteWeatherSubject();
        //创建观察者
        ConcreteWeatherObserver observerOne = new ConcreteWeatherObserver();
        observerOne.setObserverName("观察者1");
        observerOne.setRemindThing("观察者1对应的发送内容");

        ConcreteWeatherObserver observerTwo = new ConcreteWeatherObserver();
        observerTwo.setObserverName("观察者2");
        observerTwo.setRemindThing("观察者2对应的发送内容");
        //注册观察者
        weather.attach(observerOne);
        weather.attach(observerTwo);
        //目标发布天气
        weather.setWeatherContent("目标发布天气");

        System.out.println("********************************分割线*****************************");
        //利用jdk的观察者模式实现

        //创建目标
        ConcreteJdkSubject weather1 = new ConcreteJdkSubject();
        //创建观察者
        ConcreteJdkObserver jdkObserver = new ConcreteJdkObserver();
        jdkObserver.setObserverName("jdk");
        //注册观察者
        weather1.addObserver(jdkObserver);
        //目标发布天气
        weather1.setContent("发布消息");

        System.out.println("********************************分割线*****************************");
        //观察者模式衍生，区分观察者发送通知

        //创建目标
        ConcreteWeatherPlusSubject weatherPlus = new ConcreteWeatherPlusSubject();
        //创建观察者
        ConcretePlusObserver observerPlusOne = new ConcretePlusObserver();
        observerPlusOne.setObserverName("雨");
        observerPlusOne.setRemindThing("下雨了");

        ConcretePlusObserver observerPlusTwo = new ConcretePlusObserver();
        observerPlusTwo.setObserverName("雪");
        observerPlusTwo.setRemindThing("下雪了");
        //注册观察者
        weatherPlus.attach(observerPlusOne);
        weatherPlus.attach(observerPlusTwo);
        //目标发布天气
        weatherPlus.setContent("下雪");



    }

}