package com.designPatterns.creational.builder;

public interface MotherBoardBuilder {

    MotherBoardBuilder addRAM(int ramSize);

    MotherBoardBuilder addHDD(int hddSize);

    MotherBoardBuilder addProcessor(String processor);

    MotherBoardBuilder addGraphicsCard(String gpuModel);

    MotherBoardBuilder addWiFiModule(boolean included);

    MotherBoardBuilder addUSBPorts(int count);

    MotherBoardBuilder addCoolingSystem(String coolingType);

    MotherBoard build();
}
