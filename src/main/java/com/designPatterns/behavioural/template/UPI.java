package com.designPatterns.behavioural.template;

public abstract class UPI {
    private final String upiId;

    protected UPI(String upiId) {
        this.upiId = upiId;
    }

    public boolean validDateId(){
        return upiId != null && !upiId.isEmpty();
    }

    public abstract boolean makeTransaction();

    public void sendConfirmation(){
        System.out.println("Transaction completed confirmation");
    }
}
