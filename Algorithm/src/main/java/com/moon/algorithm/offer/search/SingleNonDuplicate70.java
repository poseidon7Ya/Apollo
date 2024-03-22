package com.moon.algorithm.offer.search;

import com.moon.algorithm.base.search.IBiSearch;

/**
 * 面试题70：排序数组中只出现一次的数字
 * 题目：在一个排序的数组中，除一个数字只出现一次之外，其
 * 他数字都出现了两次，请找出这个唯一只出现一次的数字。例如，
 * 在数组[1，1，2，2，3，4，4，5，5]中，数字3只出现了一次。
 */
public class SingleNonDuplicate70 implements IBiSearch {
    @Override
    public int search(int[] a, int target) {
        return solution3(a, target);
    }

    /**
     * 异或
     *
     * @param a
     * @param target
     * @return
     */
    private int solution2(int[] a, int target) {
        int result = a[0];
        for (int i = 1; i < a.length; i++) {
            result = result ^ a[i];
        }
        return result;
    }

    private int solution3(int[] a, int target) {
        // int[] c = new int[]{1, 1, 2, 2, 3, 3, 4, 5, 5};
        // [1,1] [2,2] [3,3] [4,5] [5] mid = 4
        int n = a.length;
        int low = 0, high = n / 2;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            int i = mid * 2;
            if ((i < n - 1) && (a[i] != a[i + 1])) {
                if (mid == 0 || a[i - 2] == a[i - 1]) {
                    return a[i];
                }
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return a[n - 1];
    }
}
