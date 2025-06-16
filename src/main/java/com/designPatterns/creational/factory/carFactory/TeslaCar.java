package com.designPatterns.creational.factory.carFactory;

public class TeslaCar extends Car{
    public TeslaCar(String modelName, String color, int year, double price, String engine) {
        super(modelName, color, year, price, engine);
    }

    @Override
    public void assemble() {
        this.isAssembled = true;
        System.out.println("Assembling Tesla Car");
    }
}
