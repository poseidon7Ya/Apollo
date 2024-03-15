package com.moon.algorithm.offer.string;

import com.moon.algorithm.base.string.AbstractString;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 字符串中的变位词
 * 输入字符串s1和s2，如何判断字符串s2中是否包含字符
 * 串s1的某个变位词？如果字符串s2中包含字符串s1的某个变位词，
 * 则字符串s1至少有一个变位词是字符串s2的子字符串。假设两个字
 * 符串中只包含英文小写字母。例如，字符串s1为"ac"，字符串s2
 * 为"dgcaf"，由于字符串s2中包含字符串s1的变位词"ca"，因此输出
 * 为true。如果字符串s1为"ab"，字符串s2为"dgcaf"，则输出为
 * false。
 * <p>
 * 输入字符串s1和s2，如何找出字符串s2的所有变位词在
 * 字符串s1中的起始下标？假设两个字符串中只包含英文小写字母。
 * 例如，字符串s1为"cbadabacg"，字符串s2为"abc"，字符串s2的两
 * 个变位词"cba"和"bac"是字符串s1中的子字符串，输出它们在字符
 * 串s1中的起始下标0和5。
 */
public class CheckInclusion14 extends AbstractString {
    @Override
    public boolean check(String s1, String s2) {
        if (s2.length() < s1.length()) return false;
        int[] counts = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            counts[s1.charAt(i) - 'a']++;
            counts[s2.charAt(i) - 'a']--;
        }
        if (allZero(counts)) {
            return true;
        }
        for (int i = s1.length(); i < s2.length(); i++) {
            counts[s2.charAt(i) - 'a']--;
            counts[s2.charAt(i - s1.length()) - 'a']++;
            if (allZero(counts)) {
                return true;
            }
        }
        return false;
    }

    private boolean allZero(int[] counts) {
        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
