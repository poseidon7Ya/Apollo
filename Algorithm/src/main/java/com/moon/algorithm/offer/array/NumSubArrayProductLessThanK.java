package com.moon.algorithm.offer.array;

import com.moon.algorithm.base.array.AbstractArray;
import com.moon.algorithm.base.solution.ITwoPointer;

/**
 * 乘积小于k的子数组
 * 输入一个由正整数组成的数组和一个正整数k，请问数组
 * 中有多少个数字乘积小于k的连续子数组？例如，输入数组[10，5，2，6]，k的值为100，有8个子数组的所有数字的乘积小于100，它们
 * 分别是[10]、[5]、[2]、[6]、[10，5]、[5，2]、[2，6]和[5，2，6]。
 */
public class NumSubArrayProductLessThanK extends AbstractArray implements ITwoPointer {

    @Override
    public int subArray(int[] nums, int k) {
        int n = nums.length;
        if (n < 1) return 0;
        int count = 0, l = 0, mup = 1;
        for (int r = 0; r < n; r++) {
            mup *= nums[r];
            while (l <= r && mup >= k) {
                mup /= nums[l++];
            }
            count += r >= l ? r - l + 1 : 0;
        }
        return count;
    }
}
