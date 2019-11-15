package com.mytest.demo.designpattern.chainofresponsibility;

import com.mytest.demo.designpattern.chainofresponsibility.handler.PriceHandler;

/**
 * 客户，请求折扣
 */
public class Customer {

    private PriceHandler priceHandler;

    public void requestDiscount(float discount) {
        priceHandler.processDiscount(discount);
    }

    public Customer(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }
}
