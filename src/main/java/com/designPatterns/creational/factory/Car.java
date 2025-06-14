package com.designPatterns.creational.factory;

public abstract class Car {
    protected String modelName;
    protected String color;
    protected int year;
    protected double price;
    protected String engine;
    protected boolean isAssembled;

    public Car(String modelName, String color, int year, double price, String engine) {
        this.modelName = modelName;
        this.color = color;
        this.year = year;
        this.price = price;
        this.engine = engine;
    }
    public abstract void assemble();
    public void deliver(){
        if(!isAssembled)
            System.out.println("The car is not assembled yet");
        System.out.println("Delivering the car");
    }
}
