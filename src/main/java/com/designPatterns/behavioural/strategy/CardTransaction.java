package com.designPatterns.behavioural.strategy;

public class CardTransaction implements PaymentStrategy {
    @Override
    public void makeTransaction() {
        System.out.println("Transaction is done via card...");
    }
}
