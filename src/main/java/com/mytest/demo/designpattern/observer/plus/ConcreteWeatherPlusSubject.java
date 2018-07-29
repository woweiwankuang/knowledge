package com.mytest.demo.designpattern.observer.plus;

public class ConcreteWeatherPlusSubject extends WeatherPlusSubject {

    /**
     * 目标对象的状态
     */
    private String content;

    @Override
    protected void notifyWeatherObservers() {
        //循环所有注册的观察者
        for (PlusObserver plusObserver : this.plusObservers) {
            if (this.content.contains("下雨") && plusObserver.getObserverName().contains("雨")){
                plusObserver.update(this);
            }
            if (this.content.contains("下雪") && plusObserver.getObserverName().contains("雪")){
                plusObserver.update(this);
            }
        }
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.notifyWeatherObservers();
    }
}
