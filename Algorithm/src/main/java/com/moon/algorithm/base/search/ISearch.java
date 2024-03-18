package com.moon.algorithm.base.search;

/**
 * search interface, search in a sorted array
 */
public interface ISearch {
    default int search(int[] a, int target) {
        return 0;
    }
}
