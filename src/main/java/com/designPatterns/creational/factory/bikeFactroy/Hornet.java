package com.designPatterns.creational.factory.bikeFactroy;

public class Hornet extends Bike {

    public Hornet(String name, int speed) {
        super(name, speed);
    }

    @Override
    public Bike createBike(String name, int speed) {
        return new Hornet(name, speed);
    }
}
