package com.moon.algorithm.base.search;


public class BiSearchFstEq extends AbstractSearch {
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
                // if midVal == target
                // 1. if mid == 0 or the value before midVal not equal midVal，midValue is the first one we need;
                if ((mid == 0) || (a[mid - 1] != target)) {
                    return mid;
                } else {
                    // if a[mid - 1] also equal midVal, we know first midVal in [low, mid - 1]
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
