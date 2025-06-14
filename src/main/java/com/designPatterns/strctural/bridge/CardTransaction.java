package com.designPatterns.strctural.bridge;

public class CardTransaction extends PaymentMethod {

    protected PaymentGateway paymentGateway;

    public CardTransaction(PaymentGateway paymentGateway) {
        super(paymentGateway);
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void makePayment() {
        paymentGateway.makeTransaction();
        System.out.println("Card Payment Method");
    }
}
