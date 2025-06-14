package com.designPatterns.creational.prototype;

public class Plan {
    private String name;
    private String description;
    private int price;

    public Plan(){

    }
    //Copy Constructor
    public Plan(Plan plan) {
        this.name = plan.getName();
        this.description = plan.getDescription();
        this.price = plan.getPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Plan{" + "name='" + name + '\'' + ", description='" + description + '\'' + ", price=" + price + '}';
    }
}
