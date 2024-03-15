package com.moon.algorithm.offer.string;

import com.moon.algorithm.base.string.AbstractString;

/**
 * 有效的回文
 * 给定一个字符串，请判断它是不是回文。假设只需要考
 * 虑字母和数字字符，并忽略大小写。例如，"Was it a cat I
 * saw？"是一个回文字符串，而"race a car"不是回文字符串。
 * <a href="https://leetcode.com/problems/valid-palindrome/submissions/1204353913/">...</a>
 */
public class IsPalindrome18 extends AbstractString {
    @Override
    public boolean palindrome(String s) {
        int lPointer = 0, rPointer = s.length() - 1;
        while (lPointer <= rPointer) {
            char lChar = s.charAt(lPointer), rChar = s.charAt(rPointer);
            if (!Character.isLetterOrDigit(lChar)) {
                lPointer++;
            } else if (!Character.isLetterOrDigit(rChar)) {
                rPointer--;
            } else {
                if (Character.toLowerCase(lChar) != Character.toLowerCase(rChar)) {
                    return false;
                }
                lPointer++;
                rPointer--;
            }
        }
        return true;
    }
}
