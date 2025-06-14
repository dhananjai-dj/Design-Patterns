package com.designPatterns.behavioural.visitor;

public class Book implements Item {
    String name;
    int    price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void calculateTax(ItemVisitor itemVisitor) {
        itemVisitor.execute(this);
    }
}
