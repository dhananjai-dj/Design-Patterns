package com.designPatterns.strctural.flyweight;

public class Order {
    Tea       tea;
    Container container;

    public Order(Tea tea, Container container) {
        this.tea = tea;
        this.container = container;
    }

    public void serve() {
        System.out.println("Order serving " + tea.name + " in " + container.name);
    }
}
