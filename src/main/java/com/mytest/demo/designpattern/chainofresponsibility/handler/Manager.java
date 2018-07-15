package com.mytest.demo.designpattern.chainofresponsibility.handler;

/**
 * 经理，可以批准25%以内的折扣
 */
public class Manager extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.25) {
            System.out.format("%s批准了折扣： %.2f%n", this.getClass().getName(), discount);
        }else {
            successor.processDiscount(discount);
        }
    }
}
