package com.designPatterns.creational.factory.bikeFactroy;

public class HondaBikeFactory {
    public static Bike createBike(String model, String name, int speed) {
        return switch (model) {
            case "shine" -> new Shine(name, speed);
            case "hornet" -> new Hornet(name, speed);
            default -> null;
        };
    }
}
