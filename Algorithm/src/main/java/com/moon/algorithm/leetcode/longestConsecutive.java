package com.moon.algorithm.leetcode;

import java.util.Arrays;

/**
 * 最长连续序列
 * <a href="https://leetcode.cn/problems/longest-consecutive-sequence/">...</a>
 * nums = [100,4,200,1,3,2]
 * [1, 2, 3, 4]
 * 4
 */
public class longestConsecutive {
    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int result = 1;
        int tmp = 1;
        for (int i = 1; i < nums.length; i++) {
            int currentValue = nums[i], pre = nums[i - 1];
            if (currentValue == pre) {
                continue; // 去重
            } else if (currentValue == pre + 1) {
                tmp++; // 连续序列
            } else {
                tmp = 1; // 重置
            }
            result = Math.max(result, tmp);
        }
        return result;
    }
}
