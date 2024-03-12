package com.moon.algorithm.base.sort;

/**
 * 插入排序
 */
public class InsertSort extends AbstractSort {

    @Override
    public void sortArr(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; --j) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }
}
