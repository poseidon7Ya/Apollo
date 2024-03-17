package com.moon.algorithm.offer.array;

import com.moon.algorithm.base.array.AbstractArray;

/**
 * 排序数组中的两个数字之和
 * 输入一个递增排序的数组和一个值k，请问如何在数组中
 * 找出两个和为k的数字并返回它们的下标？假设数组中存在且只存在
 * 一对符合条件的数字，同时一个数字不能使用两次。例如，输入数
 * 组[1，2，4，6，10]，k的值为8，数组中的数字2与6的和为8，它们
 * 的下标分别为1与3。
 * <a href="https://leetcode.cn/problems/two-sum/description/">...</a>
 */
public class TwoSum6 extends AbstractArray {
    @Override
    public int[] twoPointer(int[] a, int target) {
        int n = a.length;
        if (n < 1) return new int[]{};
        int l = 0, r = n - 1;
        while (l < r) {
            int sum = a[l] + a[r];
            if (sum == target) {
                return new int[]{l, r};
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return new int[0];
    }
}
