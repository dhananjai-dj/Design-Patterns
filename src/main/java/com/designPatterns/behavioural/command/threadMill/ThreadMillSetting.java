package com.designPatterns.behavioural.command.threadMill;

public class ThreadMillSetting {
    private int timing;
    private int currentSpeedLevel;

    public ThreadMillSetting() {
        timing = 0;
        currentSpeedLevel = 0;
    }

    public int getTiming() {
        return timing;
    }

    public void setTiming(int timing) {
        this.timing = timing;
    }

    public int getCurrentSpeedLevel() {
        return currentSpeedLevel;
    }

    public void setCurrentSpeedLevel(int currentSpeedLevel) {
        this.currentSpeedLevel = currentSpeedLevel;
    }

    public int getMaxSpeedLevel() {
        return 10;
    }

    public int getMinSpeedLevel() {
        return 1;
    }
}
