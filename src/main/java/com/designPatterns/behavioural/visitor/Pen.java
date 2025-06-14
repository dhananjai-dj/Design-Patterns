package com.designPatterns.behavioural.visitor;

public class Pen implements Item {
    @Override
    public void calculateTax(ItemVisitor itemVisitor) {
        itemVisitor.execute(this);
    }

    public Pen(String name, int price) {
        this.name = name;
        this.price = price;
    }

    String name;
    int    price;
}
