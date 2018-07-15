package com.mytest.demo.designpattern.chainofresponsibility.handler;

/**
 * 价格处理人，负责处理客户的折扣请求
 */
public abstract class PriceHandler {
    /**
     * 直接后继，用于传递请求
     */
    protected PriceHandler successor;

    public void setSuccessor(PriceHandler successor) {
        this.successor = successor;
    }

    /**
     * 处理折扣请求
     */
    public abstract void processDiscount(float discount);
}
