package com.designPatterns.behavioural.command.threadMill;

public class DecreaseSpeed implements CommandResolver {
    @Override
    public void execute(ThreadMillSetting threadMillSetting) {
        int currentSpeedLevel = threadMillSetting.getCurrentSpeedLevel();
        int minSpeedLevel = threadMillSetting.getMinSpeedLevel();
        if (currentSpeedLevel > minSpeedLevel) {
            threadMillSetting.setCurrentSpeedLevel(currentSpeedLevel - 1);
            System.out.println("Speed decreased. \nCurrent speed level: " + currentSpeedLevel);
        } else {
            System.out.println("Speed level can't be reduced further");
        }
    }
}
