package Sort;

import java.util.Arrays;

/**
 * 排序相关
 */
public class Solution {

    public static void mergeSort(int[] a) {
        mergeSort(a, 0, a.length - 1);
    }

    public static void mergeSort(int[] a, int l, int r) {
        // 递归终止条件
        if (l >= r) return;
        int m = (l + r) / 2;
        mergeSort(a, l, m);
        mergeSort(a, m + 1, r);
        merge(a, l, m, r);
    }

    public static void merge(int[] a, int l, int m, int r) {

    }
}
