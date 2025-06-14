package com.designPatterns.behavioural.state;

public class ATM {
    private NoCardState               noCardState;
    private CardInsertedState         cardInsertedState;
    private TransactionState          transactionState;
    private TransactionCompletedState transactionCompletedState;

    private ATMState currentATMState;

    public ATM() {
        this.noCardState = new NoCardState(this);
        this.cardInsertedState = new CardInsertedState(this);
        this.transactionState = new TransactionState(this);
        this.transactionCompletedState = new TransactionCompletedState();
        this.currentATMState = noCardState;
    }

    public void insertCard() {
        this.currentATMState.insertCard();
    }
    public void provideAccess(){
       this.currentATMState.provideAccess();
    }
    public void makeTransaction(){
       this.currentATMState.makeTransaction();
    }
    public void removeCard(){
        this.currentATMState.removeCard();
    }

    public NoCardState getNoCardState() {
        return noCardState;
    }

    public void setNoCardState(NoCardState noCardState) {
        this.noCardState = noCardState;
    }

    public CardInsertedState getCardInsertedState() {
        return cardInsertedState;
    }

    public void setCardInsertedState(CardInsertedState cardInsertedState) {
        this.cardInsertedState = cardInsertedState;
    }

    public TransactionState getTransactionState() {
        return transactionState;
    }

    public void setTransactionState(TransactionState transactionState) {
        this.transactionState = transactionState;
    }

    public TransactionCompletedState getTransactionCompletedState() {
        return transactionCompletedState;
    }

    public void setTransactionCompletedState(TransactionCompletedState transactionCompletedState) {
        this.transactionCompletedState = transactionCompletedState;
    }

    public ATMState getCurrentATMState() {
        return currentATMState;
    }

    public void setCurrentATMState(ATMState currentATMState) {
        this.currentATMState = currentATMState;
    }

    public  void display(){
        this.currentATMState.display();
    }
    public void run(){
        this.currentATMState.run();
    }
}
