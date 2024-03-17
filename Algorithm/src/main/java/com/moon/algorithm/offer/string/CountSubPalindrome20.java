package com.moon.algorithm.offer.string;

import com.moon.algorithm.base.string.AbstractString;

/**
 * 面试题20：回文子字符串的个数
 * 给定一个字符串，请问该字符串中有多少个回文连续子
 * 字符串？例如，字符串"abc"有3个回文子字符串，分别
 * 为"a"、"b"和"c"；而字符串"aaa"有6个回文子字符串，分别
 * 为"a"、"a"、"a"、"aa"、"aa"和"aaa"。
 */
public class CountSubPalindrome20 extends AbstractString {
    @Override
    public int palindromeCount(String s) {
        // a b c  n = 3
        // a b c d  n = 4
        int n = s.length();
        if (n < 1) return 0;
        int count = 0, l, r;
        int halfN = n / 2;
        if (halfN == 0) {
            r = halfN;
            l = halfN - 1;
        } else {
            l = r = n / 2;
        }
        while (l >= 0 && r <= n - 1) {
            if (s.charAt(l) == s.charAt(r)) {
                count++;
            }
            l--;
            r++;
        }
        return count;
    }
}
