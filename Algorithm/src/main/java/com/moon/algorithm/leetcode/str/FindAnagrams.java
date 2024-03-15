package com.moon.algorithm.leetcode.str;

import com.moon.algorithm.base.string.AbstractString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * find-all-anagrams-in-a-string
 * <a href="https://leetcode.com/problems/find-all-anagrams-in-a-string/">...</a>
 * s = "cbaebabacd", p = "abc"
 */
public class FindAnagrams extends AbstractString {
    @Override
    public <T> List<T> anagramsList(String s, String p) {
        if (s.length() < p.length()) return new ArrayList<>();
        Map<Character, Integer> pMap = new HashMap<>();
        List<Integer> indexList = new ArrayList<>();
        int pLen = p.length();
        for (int i = 0; i < pLen; i++) {
            pMap.merge(p.charAt(i), 1, Integer::sum);
            // 这一步初始化了 s 字符滑动窗口
            pMap.merge(s.charAt(i), -1, Integer::sum);
        }
        if (allZero(pMap)) {
            indexList.add(0);
        }
        for (int i = pLen; i < s.length(); i++) {
            // 往右移动窗口
            pMap.merge(s.charAt(i), -1, Integer::sum); // 新字符
            pMap.merge(s.charAt(i - pLen), 1, Integer::sum); // 旧字符
            if (allZero(pMap)) {
                indexList.add(i - pLen + 1);
            }
        }
        return (List<T>) indexList;
    }
}
