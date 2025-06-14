package com.designPatterns.strctural.proxy;

public class ProxyObject implements Object {

    private final String     name;
    private       RealObject realObject;

    public ProxyObject(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        if (realObject == null) {
            realObject = new RealObject(name);
        }
        realObject.display();
    }
}
