package com.designPatterns.behavioural.command.threadMill;

public class Reset implements CommandResolver {
    @Override
    public void execute(ThreadMillSetting threadMillSetting) {
        System.out.println("Resetting thread mill");
        threadMillSetting.setCurrentSpeedLevel(1);
        threadMillSetting.setTiming(0);
    }
}
