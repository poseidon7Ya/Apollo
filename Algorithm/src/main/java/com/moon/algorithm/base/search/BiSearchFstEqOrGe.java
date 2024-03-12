package com.moon.algorithm.base.search;


public class BiSearchFstEqOrGe extends AbstractSearch {
    @Override
    public int biSearch(int[] a, int n, int target) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            int midVal = a[mid];
            if (midVal >= target) {
                if ((mid == 0) || (a[mid - 1] < target)) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
