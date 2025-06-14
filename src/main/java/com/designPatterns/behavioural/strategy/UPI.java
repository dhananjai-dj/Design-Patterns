package com.designPatterns.behavioural.strategy;

public class UPI implements PaymentStrategy {
    @Override
    public void makeTransaction() {
        System.out.println("Transaction is done via UPI...");
    }
}
