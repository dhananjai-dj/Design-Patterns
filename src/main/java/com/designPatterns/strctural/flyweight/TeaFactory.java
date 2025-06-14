package com.designPatterns.strctural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TeaFactory {
    Map<String, Tea> cache = new HashMap<String, Tea>();

    public Tea makeTea(Tea tea) {
        cache.putIfAbsent(tea.name, new Tea(tea.name));
        return cache.get(tea.name);
    }
}
