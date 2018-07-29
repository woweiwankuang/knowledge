package com.mytest.demo.designpattern.observer.plus;

public class ConcretePlusObserver implements PlusObserver {

    /**
     * 观察者名称
     */
    private String observerName;

    /**
     * 天晴情况内容
     */
    private String weatherContent;

    /**
     * 提醒内容
     */
    private String remindThing;

    @Override
    public void update(WeatherPlusSubject subject) {
        System.out.println(this.observerName + "收到了" + ((ConcreteWeatherPlusSubject) subject).getContent() + ",发送消息：" + this.remindThing);
    }

    @Override
    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public String getObserverName() {
        return this.observerName;
    }

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
    }

    public String getRemindThing() {
        return remindThing;
    }

    public void setRemindThing(String remindThing) {
        this.remindThing = remindThing;
    }
}
