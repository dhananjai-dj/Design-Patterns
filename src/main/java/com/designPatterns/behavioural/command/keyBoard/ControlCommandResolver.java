package com.designPatterns.behavioural.command.keyBoard;

import java.util.HashMap;
import java.util.Map;

public class ControlCommandResolver {
    private final Map<ControlKey, ControlCommand> map = new HashMap<>();

    public ControlCommandResolver() {
        map.put(new ControlKey("ctrl", "c"), new CopyCommand());
        map.put(new ControlKey("ctrl", "x"), new CutCommand());
        map.put(new ControlKey("ctrl", "p"), new PasteCommand());
        map.put(new ControlKey("ctrl", "y"), null);
        map.put(new ControlKey("ctrl", "z"), null);
    }

    public ControlCommand resolve(ControlKey key) {
        return map.getOrDefault(key, null);
    }

}
