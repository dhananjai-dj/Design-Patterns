package com.designPatterns.creational.abstractFactroy;

public class TeslaFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new TeslaCar();
    }

    @Override
    public Bike createBike() {
        return new TeslaBike();
    }
}
