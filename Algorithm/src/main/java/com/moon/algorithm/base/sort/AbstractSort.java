package com.moon.algorithm.base.sort;

public abstract class AbstractSort implements Sort {
    public void swap(int[] a, int i, int j) {
        if (a.length <= 1) return;
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void mergeArr(int[] a, int l, int m, int r) {
        int[] la = new int[m - l + 2], ra = new int[r - m + 1];
        System.arraycopy(a, l, la, 0, m - l + 1);
        la[m - l + 1] = Integer.MAX_VALUE;
        System.arraycopy(a, m + 1, ra, 0, r - m);
        ra[r - m] = Integer.MAX_VALUE;
        int i = 0, j = 0, k = l;
        while (k <= r) {
            if (la[i] <= ra[j]) {
                a[k++] = la[i++];
            } else {
                a[k++] = ra[j++];
            }
        }
    }

    /**
     * 分区函数
     * @param a
     * @param l
     * @param r
     * @return
     */
    public int partition(int[] a, int l, int r) {
        int pivot = a[r];
        int i = l;
        for (int j = l; j < r; j++) {
            if (a[j] < pivot) {
                swap(a, i, j);
                i++;
            }
        }
        swap(a, i, r);
        return i;
    }

    public abstract void sortArr(int[] a, int n);

    @Override
    public void sort(int[] a) {
        int n = a.length;
        if (n <= 1) return;
        sortArr(a, n);
    }
}
