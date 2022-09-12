package com.epam.mjc.collections.map;

import java.util.Map;
import java.util.HashMap;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();
        for (Map.Entry<Integer, String> temp : sourceMap.entrySet()) {
            if(!map.containsKey(temp.getValue()))
                    map.put(temp.getValue(), temp.getKey());
        }
        return map;
    }
}
