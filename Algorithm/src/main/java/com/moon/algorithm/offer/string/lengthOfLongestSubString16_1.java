package com.moon.algorithm.offer.string;

import com.moon.algorithm.base.string.AbstractString;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 不含重复字符的最长子字符串
 * 输入一个字符串，求该字符串中不含重复字符的最长子
 * 字符串的长度。例如，输入字符串"babcca"，其最长的不含重复字
 * 符的子字符串是"abc"，长度为3。
 */
public class lengthOfLongestSubString16_1 extends AbstractString {
    //

    @Override
    public Integer longestSubString(String s) {
        return solution1(s);
    }

    private Integer solution1(String s) {
        int len = s.length();
        if (len < 1) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int i = -1;
        int longest = 1;
        int count = 0;
        for (int j = 0; j < len; j++) {
            // j 左指针
            char c = s.charAt(j);
            map.merge(c, 1, Integer::sum);
            if (map.get(c) == 2) {
                count++;
            }
            while (count > 0) {
                i++; // i 右指针
                char c1 = s.charAt(i);
                map.merge(c1, -1, Integer::sum);
                if (map.get(c1) == 1) {
                    count--;
                }
            }
            longest = Math.max(j - i, longest);
        }
        return longest;
    }
}
