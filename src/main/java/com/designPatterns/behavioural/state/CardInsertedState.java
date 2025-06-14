package com.designPatterns.behavioural.state;

public class CardInsertedState implements ATMState {

    private final ATM atm;

    public CardInsertedState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void display() {
        System.out.println("Please enter your pin number");
    }

    @Override
    public void run() {
        System.out.println("Please wait we are verifying your pin number");
    }

    @Override
    public void provideAccess(){
        System.out.println("Your pin has been verified you can proceed");
        atm.setCurrentATMState(atm.getTransactionState());
    }

    @Override
    public void insertCard() {
        System.out.println("This method is not allowed in this state");
    }

    @Override
    public void makeTransaction() {
        System.out.println("This method is not allowed in this state");
    }

    @Override
    public void removeCard() {
        System.out.println("This method is not allowed in this state");
    }
}
