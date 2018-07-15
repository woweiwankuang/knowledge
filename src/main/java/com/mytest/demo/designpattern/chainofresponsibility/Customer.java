package com.mytest.demo.designpattern.chainofresponsibility;

import com.mytest.demo.designpattern.chainofresponsibility.handler.PriceHandler;
import lombok.AllArgsConstructor;

/**
 * 客户，请求折扣
 */
@AllArgsConstructor
public class Customer {

    private PriceHandler priceHandler;

    public void requestDiscount(float discount) {
        priceHandler.processDiscount(discount);
    }
}
