package com.mytest.demo.designpattern.chainofresponsibility.handler;

public class PriceHandlerFactory {

    /**
     * 创建priceHandler的工厂方法
     */
    public static PriceHandler createPriceHandler() {
        PriceHandler sales = new Sales();
        PriceHandler manager = new Manager();
        PriceHandler ceo = new CEO();

        sales.setSuccessor(manager);
        manager.setSuccessor(ceo);
        return sales;
    }
}
