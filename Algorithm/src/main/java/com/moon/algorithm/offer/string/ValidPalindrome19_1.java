package com.moon.algorithm.offer.string;

import com.moon.algorithm.base.string.AbstractString;

/**
 * 面试题19：最多删除一个字符得到回文
 * 给定一个字符串，请判断如果最多从字符串中删除一个
 * 字符能不能得到一个回文字符串。例如，如果输入字符串"abca"，
 * 由于删除字符'b'或'c'就能得到一个回文字符串，因此输出为
 * true。
 */
public class ValidPalindrome19_1 extends AbstractString {
    @Override
    public boolean palindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1, false);
    }

    private boolean isPalindrome(String s, int l, int r, boolean tried) {
        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                if (tried) {
                    return false;
                } else {
                    return isPalindrome(s, l + 1, r, true) || isPalindrome(s, l, r - 1, true);
                }
            }
        }
        return true;
    }
}
