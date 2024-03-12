package com.moon.algorithm.base.search;


public class BiSearchLstEq extends AbstractSearch {
    @Override
    public int biSearch(int[] a, int n, int target) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            int midVal = a[mid];
            if (midVal > target) {
                high = mid - 1;
            } else if (midVal < target) {
                low = mid + 1;
            } else {
                if ((mid == n - 1) || (a[mid + 1] != target)) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
