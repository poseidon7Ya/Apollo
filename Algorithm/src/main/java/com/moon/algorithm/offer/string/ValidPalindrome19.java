package com.moon.algorithm.offer.string;

import com.moon.algorithm.base.solution.ITwoPointer;
import com.moon.algorithm.base.string.AbstractString;

/**
 *
 * <a href="https://leetcode.com/problems/valid-palindrome-ii/submissions/1205263871/">...</a>
 * 面试题19：最多删除一个字符得到回文
 * 给定一个字符串，请判断如果最多从字符串中删除一个
 * 字符能不能得到一个回文字符串。例如，如果输入字符串"abca"，
 * 由于删除字符'b'或'c'就能得到一个回文字符串，因此输出为
 * true。
 */
public class ValidPalindrome19 extends AbstractString implements ITwoPointer {
    @Override
    public boolean palindrome(String s) {
        int lPointer = 0, rPointer = s.length() - 1;
        while (lPointer <= rPointer) {
            if (s.charAt(lPointer) == s.charAt(rPointer)) {
                lPointer++;
                rPointer--;
            } else {
                return isPalindrome(s, lPointer + 1, rPointer)
                        || isPalindrome(s, lPointer, rPointer - 1);
            }
        }
        return true;
    }

    private boolean isPalindrome(String s, int l, int r) {
        while (l <= r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}
