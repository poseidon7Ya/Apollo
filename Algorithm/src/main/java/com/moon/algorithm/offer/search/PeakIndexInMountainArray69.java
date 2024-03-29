package com.moon.algorithm.offer.search;

import com.moon.algorithm.base.search.IBiSearch;

/**
 * 面试题69：山峰数组的顶部
 * 在一个长度大于或等于3的数组中，任意相邻的两个数字
 * 都不相等。该数组的前若干数字是递增的，之后的数字是递减的，
 * 因此它的值看起来像一座山峰。请找出山峰顶部，即数组中最大值
 * 的位置。例如，在数组[1，3，5，4，2]中，最大值是5，输出它在
 * 数组中的下标2。
 */
public class PeakIndexInMountainArray69 implements IBiSearch {

    @Override
    public int search(int[] a, int target) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            int midVal = a[mid], leftVal = a[mid - 1], rightVal = a[mid + 1];
            if ((midVal > leftVal) && (midVal > rightVal)) {
                return mid;
            } else if (leftVal > midVal) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
