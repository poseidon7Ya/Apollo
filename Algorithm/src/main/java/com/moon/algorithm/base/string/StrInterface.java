package com.moon.algorithm.base.string;

import java.util.ArrayList;
import java.util.List;

public interface StrInterface extends CharSequence {
    default boolean check(String s1, String s2) {
        return false;
    }

    default List<Integer> findAnagrams(String s, String p) {
        return new ArrayList<>();
    }

    default Integer longestSubString(String s) {
        return 0;
    }
}
