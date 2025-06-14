package com.designPatterns.behavioural.strategy;

public class PaymentService {
    private final PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void makeTransaction() {
        paymentStrategy.makeTransaction();
    }
}
