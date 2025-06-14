package com.designPatterns.strctural.bridge;

public class RazorPay implements PaymentGateway{
    @Override
    public void makeTransaction() {
        System.out.println("Razor Payment transaction is done");
    }
}
