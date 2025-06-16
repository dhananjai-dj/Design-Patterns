package com.designPatterns.creational.factory.bikeFactroy;

public class Shine extends Bike {

    public Shine(String name, int speed) {
        super(name, speed);
    }

    @Override
    public Bike createBike(String name, int speed) {
        return new Shine(name, speed);
    }
}
