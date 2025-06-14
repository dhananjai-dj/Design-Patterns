package com.designPatterns.behavioural.memento;

public class TransactionProcess {
    private       int    stepId;
    private final String transactionId;

    public TransactionProcess(String transactionId) {
        this.transactionId = transactionId;
    }

    public int getStepId() {
        return stepId;
    }

    public void setStepId(int stepId) {
        this.stepId = stepId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void processNextStep() throws Exception {
        switch (stepId) {
        case 0:
            System.out.println("Step 0 is processed");
            stepId++;
            break;
        case 1:
            System.out.println("Step 1 is processed");
            stepId++;
            break;
        case 2:
            throw new Exception("Error in processing step 2");
        case 3:
            System.out.println("Step 3 is processed");
            stepId++;
            break;
        }
    }

    public TransactionState save() {
        return new TransactionState(stepId, transactionId);
    }

    public void restore(TransactionState transactionState) {
        this.stepId = transactionState.stepId();
    }

    public boolean isComplete() {
        return stepId == 3;
    }
}
