package com.designPatterns.creational.builder;


public class MotherBoard {
    private int     ramSize;
    private int     hddSize;
    private int     usbPorts;
    private String  gpuModel;
    private String  processor;
    private String  coolingType;
    private boolean wifiIncluded;

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public void setUsbPorts(int usbPorts) {
        this.usbPorts = usbPorts;
    }

    public void setGpuModel(String gpuModel) {
        this.gpuModel = gpuModel;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setCoolingType(String coolingType) {
        this.coolingType = coolingType;
    }

    public void setWifiIncluded(boolean wifiIncluded) {
        this.wifiIncluded = wifiIncluded;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public int getUsbPorts() {
        return usbPorts;
    }

    public String getGpuModel() {
        return gpuModel;
    }

    public String getProcessor() {
        return processor;
    }

    public String getCoolingType() {
        return coolingType;
    }

    public boolean isWifiIncluded() {
        return wifiIncluded;
    }

    @Override
    public String toString() {
        return "MotherBoard{" + "ramSize=" + ramSize + ", hddSize=" + hddSize + ", usbPorts=" + usbPorts + ", gpuModel='" + gpuModel + '\'' + ", processor='" + processor + '\'' + ", coolingType='" + coolingType + '\'' + ", wifiIncluded=" + wifiIncluded + '}';
    }
}
