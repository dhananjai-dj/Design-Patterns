package com.designPatterns.behavioural.strategy;

public class NetBanking implements PaymentStrategy {
    @Override
    public void makeTransaction() {
        System.out.println("Transaction is done via NetBanking...");
    }
}
