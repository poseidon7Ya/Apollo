package com.moon.algorithm.offer.array;

import com.moon.algorithm.base.array.AbstractArray;
import com.moon.algorithm.base.solution.ITwoPointer;

import java.util.HashMap;
import java.util.Map;

/**
 * 和大于或等于k的最短子数组
 * 输入一个正整数组成的数组和一个正整数k，请问数组中
 * 和大于或等于k的连续子数组的最短长度是多少？如果不存在所有数
 * 字之和大于或等于k的子数组，则返回0。
 * 例如，输入数组[5，1，4，3]，k的值为7，和大于或等于7的最短连续子数组是[4，3]，因
 * 此输出它的长度2。
 */
public class MinSubArrayLen extends AbstractArray implements ITwoPointer {

    @Override
    public int subArray(int[] nums, int target) {
        int n = nums.length;
        if (n < 1) return 0;
        int l = 0, r = 0;
        int minLen = Integer.MAX_VALUE;
        while (l < n && r < n) {
            int sum = sum(nums, l, r);
            if (sum < target) {
                r++;
            } else {
                minLen = Math.min(minLen, r - l + 1);
                l++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    private int sum(int[] nums, int l, int r) {
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }
}
