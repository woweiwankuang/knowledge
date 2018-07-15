package com.mytest.demo.designpattern.chainofresponsibility.handler;

/**
 * ceo,可以批准50%以内的折扣，如果超出就拒绝
 */

public class CEO extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.5) {
            System.out.format("%s批准了折扣： %.2f%n", this.getClass().getName(), discount);
        } else {
            System.out.format("%s拒绝了折扣： %.2f%n", this.getClass().getName(), discount);
        }
    }
}
