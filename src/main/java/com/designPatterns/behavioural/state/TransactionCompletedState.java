package com.designPatterns.behavioural.state;

public class TransactionCompletedState implements ATMState {

    @Override
    public void display() {
        System.out.println("Transaction is completed please collect your card");
    }

    @Override
    public void run() {
        System.out.println("Release the card");
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
    public void makeTransaction() {
        System.out.println("This method is not allowed in this state");
    }

    public void removeCard(){
        System.out.println("Your card has been removed");
    }

}
