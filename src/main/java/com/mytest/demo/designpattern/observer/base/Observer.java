package com.mytest.demo.designpattern.observer.base;

/**
 * 观察者接口，定义一个更新的接口给那些在目标对象发生变化的时候被通知的对象
 */
public interface Observer {

    /**
     * 更新的接口
     * @param subject 目标对象
     * 传了目标对象，观察者可以直接去获取目标对象的数据，是【拉模型】
     * 如果只传需要的信息，譬如这里是string的天气内容，这种方式为【推模型】
     */
     void update(Subject subject);
}
