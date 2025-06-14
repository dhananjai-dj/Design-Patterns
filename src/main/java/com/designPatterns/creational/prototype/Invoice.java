package com.designPatterns.creational.prototype;

import java.time.LocalDateTime;

public class Invoice implements InvoicePrototype {

    private User          user;
    private Plan          plan;
    private LocalDateTime createdDate;
    private double        totalAmount;


    public Invoice() {
    }

    public Invoice(User user, Plan plan) {
        this.user = new User(user);
        this.plan = new Plan(plan);
        this.createdDate = LocalDateTime.now();
        this.totalAmount = calculateTotalAmount();
    }

    public Invoice(Invoice other) {
        this.user = new User(other.user);
        this.plan = new Plan(other.plan);
        this.createdDate = LocalDateTime.now();
        this.totalAmount = calculateTotalAmount();
    }


    private double calculateTotalAmount() {
        return plan.getPrice() * user.getUsage();
    }

    @Override
    public InvoicePrototype clone() {
        return new Invoice(this);
    }

    @Override
    public String toString() {
        return "Invoice{" + "user=" + user.toString() + ", plan=" + plan.toString() + ", createdDate=" + createdDate + ", totalAmount=" + totalAmount + '}';
    }
}
