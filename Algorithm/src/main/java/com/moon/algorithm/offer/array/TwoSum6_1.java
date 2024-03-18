package com.moon.algorithm.offer.array;

import com.moon.algorithm.base.array.AbstractArray;
import com.moon.algorithm.base.solution.IHash;

import java.util.HashMap;
import java.util.Map;

/**
 * 排序数组中的两个数字之和
 * 输入一个递增排序的数组和一个值k，请问如何在数组中
 * 找出两个和为k的数字并返回它们的下标？假设数组中存在且只存在
 * 一对符合条件的数字，同时一个数字不能使用两次。例如，输入数
 * 组[1，2，4，6，10]，k的值为8，数组中的数字2与6的和为8，它们
 * 的下标分别为1与3。
 */
public class TwoSum6_1 extends AbstractArray implements IHash {
    @Override
    public int[] sum(int[] a, int target) {
        int n = a.length;
        if (n < 1) return new int[]{};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int val = target - a[i];
            if (map.containsKey(val)) {
                return new int[]{map.get(val), i};
            }
            map.put(a[i], i);
        }
        return new int[0];
    }
}
