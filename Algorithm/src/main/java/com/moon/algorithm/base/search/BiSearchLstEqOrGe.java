package com.moon.algorithm.base.search;


public class BiSearchLstEqOrGe extends AbstractSearch {
    @Override
    public int biSearch(int[] a, int n, int target) {
        // [0,1,2,3,4,5,6,6] 6
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            int midVal = a[mid];
            if (midVal <= target) {
                if ((mid == n - 1) || (a[mid + 1] > target)) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else {
                high = high - 1;
            }
        }
        return -1;
    }
}
