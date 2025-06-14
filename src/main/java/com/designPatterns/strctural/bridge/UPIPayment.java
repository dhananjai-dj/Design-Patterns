package com.designPatterns.strctural.bridge;

public class UPIPayment extends PaymentMethod {

    protected PaymentGateway paymentGateway;

    public UPIPayment(PaymentGateway paymentGateway) {
        super(paymentGateway);
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void makePayment() {
        System.out.println("Making up an UPI Payment");
        paymentGateway.makeTransaction();
    }
}
