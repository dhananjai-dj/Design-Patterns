package com.designPatterns.behavioural.state;

public class NoCardState implements ATMState {

    private final ATM atm;

    public NoCardState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void display() {
        System.out.println("Please insert your card");
    }

    @Override
    public void run() {
        System.out.println("Please wait we are verifying your card");
    }

    @Override
    public void insertCard(){
        System.out.println("Your card has been inserted");
        atm.setCurrentATMState(atm.getCardInsertedState());
    }

    @Override
    public void provideAccess() {
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
