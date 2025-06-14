package com.designPatterns.creational.builder;

public class HPMotherBoard implements MotherBoardBuilder {
    private final MotherBoard motherBoard = new MotherBoard();

    @Override
    public MotherBoardBuilder addRAM(int ramSize) {
        motherBoard.setRamSize(ramSize);
        return this;
    }

    @Override
    public MotherBoardBuilder addHDD(int hddSize) {
        motherBoard.setHddSize(hddSize);
        return this;
    }

    @Override
    public MotherBoardBuilder addProcessor(String processor) {
        motherBoard.setProcessor(processor);
        return this;
    }

    @Override
    public MotherBoardBuilder addGraphicsCard(String gpuModel) {
        motherBoard.setGpuModel(gpuModel);
        return this;
    }

    @Override
    public MotherBoardBuilder addWiFiModule(boolean included) {
        motherBoard.setWifiIncluded(included);
        return this;
    }

    @Override
    public MotherBoardBuilder addUSBPorts(int count) {
        motherBoard.setUsbPorts(count);
        return this;
    }

    @Override
    public MotherBoardBuilder addCoolingSystem(String coolingType) {
        motherBoard.setCoolingType(coolingType);
        return this;
    }

    @Override
    public MotherBoard build() {
        return motherBoard;
    }
}
/*
Uses
1.Use the Builder to construct Composite trees or other complex objects. - Criteria Builder in JPA
2.Use the Builder pattern to eliminate the need for a telescoping constructor when creating objects with multiple parameters, especially when the number or combination of parameters may change over time.
 */