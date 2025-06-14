package com.designPatterns.creational.abstractFactroy;

public class TeslaCar extends Car {
    @Override
    public void assemble() {
        System.out.println("Tesla Car assembled");
    }
}
