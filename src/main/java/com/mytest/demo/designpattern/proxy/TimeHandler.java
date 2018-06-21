package com.mytest.demo.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {

    private Object target;

    public TimeHandler(Object target) {
        super();
        this.target = target;
    }

    /**
     *
     * @param proxy 被代理对象
     * @param method 被代理对象方法
     * @param args 方法参数
     * @return 方法的返回值
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶");
        method.invoke(target);
        long endTime = System.currentTimeMillis();
        System.out.println("汽车结束行驶，汽车行驶时间：" + (endTime - startTime) + "毫秒");
        return null;
    }
}
