package com.designPatterns.behavioural.state;

public class TransactionState implements ATMState {

    private final ATM atm;

    public TransactionState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void display() {
        System.out.println("Please enter you amount");
    }

    @Override
    public void run() {
        System.out.println("Please wait we are initiating your transaction");
    }

    @Override
    public void insertCard() {
        System.out.println("This method is not allowed in this state");
    }

    @Override
    public void provideAccess() {
        System.out.println("This method is not allowed in this state");
    }

    @Override
    public void makeTransaction(){
        System.out.println("Transaction is completed please collect your cash");
        this.atm.setCurrentATMState(atm.getTransactionCompletedState());
    }

    @Override
    public void removeCard() {
        System.out.println("This method is not allowed in this state");
    }
}
