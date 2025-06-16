package com.designPatterns.behavioural.command.threadMill;

public class IncreaseSpeed implements CommandResolver {
    @Override
    public void execute(ThreadMillSetting threadMillSetting) {
        int currentSpeedLevel = threadMillSetting.getCurrentSpeedLevel();
        int maxSpeedLevel = threadMillSetting.getMaxSpeedLevel();
        if (currentSpeedLevel <= maxSpeedLevel) {
            threadMillSetting.setCurrentSpeedLevel(currentSpeedLevel + 1);
            System.out.println("Speed increased. \nCurrent speed level: " + currentSpeedLevel);
        } else {
            System.out.println("Speed level out of range");
        }
    }
}
