package com.designPatterns.creational.factory.bikeFactroy;

public abstract class Bike {
    private String name;
    private int speed;

    public Bike(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Bike{" + "name='" + name + '\'' + ", speed=" + speed + '}';
    }

    public abstract Bike createBike(String name, int speed);
}
