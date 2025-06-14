package com.designPatterns.behavioural.observer;

public class Person implements Observer {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + " received notification");
    }
}
