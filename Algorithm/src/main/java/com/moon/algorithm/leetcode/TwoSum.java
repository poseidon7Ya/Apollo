package com.moon.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * <a href="https://leetcode.cn/problems/two-sum/description/">...</a>
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i ++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
