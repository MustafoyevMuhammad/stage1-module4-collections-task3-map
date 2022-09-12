package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        sentence = sentence.toLowerCase();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) >= 97 && sentence.charAt(i) <= 122 || sentence.charAt(i) == 32){}
            else sentence = sentence.replace(sentence.charAt(i)+"","");
        }
        for (String str : sentence.split(" ")) {
            if(map.containsKey(str))
                map.put(str, map.get(str) + 1);
            else
                map.put(str, 1);
        }
        return map;
    }
}
