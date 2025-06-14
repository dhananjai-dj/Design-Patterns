package com.designPatterns.strctural.proxy;

public class RealObject implements Object {

    private final String name;

    public RealObject(String name) {
        this.name = name;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading " + name + " from Disk");
    }

    @Override
    public void display() {
        System.out.println("Object " + name + " is fetched");
    }

}
