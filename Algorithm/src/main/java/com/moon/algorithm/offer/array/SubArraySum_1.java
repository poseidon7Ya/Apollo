package com.moon.algorithm.offer.array;

import com.moon.algorithm.base.array.AbstractArray;
import com.moon.algorithm.base.solution.IAddArray;
import com.moon.algorithm.base.solution.IHash;

import java.util.HashMap;
import java.util.Map;

/**
 * 和为k的子数组
 * 输入一个整数数组和一个整数k，请问数组中有多少个数字之和等于k的连续子数组？
 * 例如，输入数组[1，1，1]，k的值为 2，有2个连续子数组之和等于2。
 * <p>
 * 双重遍历
 */
public class SubArraySum_1 extends AbstractArray {

    @Override
    public int subArray(int[] nums, int target) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j >= 0; j--) {
                sum += nums[j];
                if (sum == target) {
                    count++;
                }
            }
        }
        return count;
    }
}
