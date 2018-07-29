package com.mytest.demo.designpattern.observer.plus;

/**
 * 定义一个更新的接口给那些在目标对象发生变化的时候被通知的对象调用
 */
public interface PlusObserver {

    /**
     * 更新的接口
     * @param subject 目标
     */
    void update(WeatherPlusSubject subject);

    /**
     * 设置观察者名称
     */
    void setObserverName(String observerName);

    /**
     * 获取观察者名称
     */
    String getObserverName();
}
