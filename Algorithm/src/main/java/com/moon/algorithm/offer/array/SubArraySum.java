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
 */
public class SubArraySum extends AbstractArray implements IHash, IAddArray {

    @Override
    public int subArray(int[] nums, int target) {
        Map<Integer, Integer> sumCount = new HashMap<>();
        sumCount.put(0, 1);
        int sum = 0, count = 0;
        for (int num : nums) {
            sum += num;
            count += sumCount.getOrDefault(sum - target, 0);
            sumCount.put(sum, sumCount.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
