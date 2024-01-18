package com.leetcode.offer;

import java.util.Arrays;

/**
 * merge sort <a href="https://en.wikipedia.org/wiki/Merge_sort">...</a>
 */
public class mergeSort {
    public static void merge(int[] a) {
        mergeSort(a, 0, a.length - 1);
    }

    public static void mergeSort(int[] a, int l, int r) {
        // recursion end
        if (l >= r) return;
        int mid = l + r >>> 1;
        mergeSort(a, l, mid);
        mergeSort(a, mid + 1, r);
        merge(a, l, mid, r);
    }

    public static void merge(int[] a, int l, int mid, int r) {

        int[] lArr = Arrays.copyOfRange(a, l, mid);
        int[] rArr = Arrays.copyOfRange(a, mid + 1, r);

    }
}
