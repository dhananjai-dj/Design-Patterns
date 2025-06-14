package com.designPatterns.strctural.bridge;

public abstract class PaymentMethod {
    protected PaymentGateway paymentGateway;

    public PaymentMethod(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public abstract void makePayment();
}
