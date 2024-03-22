package com.moon.algorithm.offer.search;

import com.moon.algorithm.base.solution.IHash;

import java.util.HashMap;
import java.util.Map;

/**
 * 面试题70：排序数组中只出现一次的数字
 * 题目：在一个排序的数组中，除一个数字只出现一次之外，其
 * 他数字都出现了两次，请找出这个唯一只出现一次的数字。例如，
 * 在数组[1，1，2，2，3，4，4，5，5]中，数字3只出现了一次。
 */
public class SingleNonDuplicate70_1 implements IHash {

    private int solution(int[] a, int target) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int value : a) {
            countMap.merge(value, 1, Integer::sum);
        }
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == target) return entry.getKey();
        }
        return -1;
    }
}
