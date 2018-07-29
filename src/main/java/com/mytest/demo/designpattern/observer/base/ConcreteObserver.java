package com.mytest.demo.designpattern.observer.base;

/**
 * 具体的观察者对象，实现更新的方法，使自身的状态和目标的状态保持一致
 */
public class ConcreteObserver implements Observer {

    /**
     * 观察者状态
     */
    private String observerState;

    /**
     * 获取目标类的状态同步到观察者的状态中
     * @param subject 目标对象
     */
    @Override
    public void update(Subject subject) {
        this.observerState = ((ConcreteSubject)subject).getSubjectState();
    }
}
