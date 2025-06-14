package com.designPatterns.behavioural.visitor;

public class TaxCalculator implements ItemVisitor {
    @Override
    public void execute(Book book) {
        System.out.println("Tax Calculator for book " + book.name + " : " + book.price * 2);
    }

    @Override
    public void execute(Pen pen) {
        System.out.println("Tax Calculator for Pen " + pen.name + " : " + pen.price * 3);

    }
}
