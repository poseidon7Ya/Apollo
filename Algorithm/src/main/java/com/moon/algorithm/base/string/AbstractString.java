package com.moon.algorithm.base.string;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractString implements IString {

    protected Map<Character, Integer> charCountMap(String s) {
        Map<Character, Integer> map = new HashMap<>(0);
        for (char c : s.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }
        return map;
    }

    protected boolean allZero(Map<Character, Integer> map) {
        Collection<Integer> values = map.values();
        for (Integer val : values) {
            if (val != 0) return false;
        }
        return true;
    }
}
