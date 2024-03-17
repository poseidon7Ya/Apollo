package com.moon.algorithm.base.string;

import java.util.ArrayList;
import java.util.List;

public interface StrInterface extends CharSequence {

    default boolean anagrams(String s1, String s2) {
        return false;
    }
    default <T> List<T> anagramsList(String s1, String s2) {
        return new ArrayList<>();
    }

    default boolean palindrome(String s) {
        return false;
    }

    default int palindromeCount(String s) {
        return 0;
    }

    default Integer longestSubString(String s) {
        return 0;
    }
}
