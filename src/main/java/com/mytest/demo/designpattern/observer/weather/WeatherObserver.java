package com.mytest.demo.designpattern.observer.weather;

/**
 * 观察者接口，定义一个更新的接口给那些在目标对象发生变化的时候被通知的对象
 */
public interface WeatherObserver {

    /**
     * 更新的接口
     * @param weatherSubject 目标对象
     * 传了目标对象，观察者可以直接去获取目标对象的数据，是【拉模型】
     * 如果只传需要的信息，譬如这里是string的天气内容，这种方式为【推模型】
     * 推模型是假定目标对象知道观察者需要什么，会使观察者对象难以复用
     * 拉模型是目标对象不知道观察者需要什么数据，因此把自身传过去，基本上可以适用各种情况
     */
    void update(WeatherSubject weatherSubject);
}
