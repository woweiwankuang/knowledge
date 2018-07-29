package com.mytest.demo.designpattern.observer.weather;

/**
 * 具体的观察者对象，实现更新的方法，使自身的状态和目标的状态保持一致
 */
public class ConcreteWeatherObserver implements WeatherObserver {

    /**
     * 观察者的名字
     */
    private String observerName;

    /**
     * 天气内容的情况，这个信息从目标处获取
     */
    private String weatherContent;

    /**
     * 提醒的内容，根据观察者的不同而不同
     */
    private String remindThing;

    /**
     * 获取目标类的状态同步到观察者的状态中
     * @param weatherSubject 目标对象
     */
    @Override
    public void update(WeatherSubject weatherSubject) {
        this.weatherContent = ((ConcreteWeatherSubject)weatherSubject).getWeatherContent();
        System.out.println(this.observerName + "收到了" + this.remindThing);
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
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
