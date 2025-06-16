package com.designPatterns.creational.factory.bikeFactroy;

public class Main {
    public static void main(String[] args) {
        Bike shineBike = HondaBikeFactory.createBike("shine", "Shine 125", 100);
        Bike hornetBike = HondaBikeFactory.createBike("hornet", "Hornet 155", 130);
        System.out.println(shineBike.toString());
        System.out.println(hornetBike.toString());
    }
}
