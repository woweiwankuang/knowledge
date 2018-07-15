package com.mytest.demo.designpattern.chainofresponsibility;

import com.mytest.demo.designpattern.chainofresponsibility.handler.PriceHandlerFactory;
import org.junit.Test;

import java.util.Random;

public class CROTest {

    @Test
    public void CROTest() {
        Customer customer = new Customer(PriceHandlerFactory.createPriceHandler());

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            System.out.print(i + ":");
            customer.requestDiscount(random.nextFloat());
        }

    }

}