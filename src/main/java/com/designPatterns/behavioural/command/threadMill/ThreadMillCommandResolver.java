package com.designPatterns.behavioural.command.threadMill;

import java.util.HashMap;
import java.util.Map;

public class ThreadMillCommandResolver {

    private final Map<String, CommandResolver> commands = new HashMap<>();

    public ThreadMillCommandResolver() {
        commands.put("increaseSpeed", new IncreaseSpeed());
        commands.put("decreaseSpeed", new DecreaseSpeed());
        commands.put("reset", new Reset());
    }

    public void executeCommand(String key, ThreadMillSetting threadMillSetting) {
        commands.get(key).execute(threadMillSetting);
    }
}
