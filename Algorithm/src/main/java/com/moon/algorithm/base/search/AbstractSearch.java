package com.moon.algorithm.base.search;

public abstract class AbstractSearch implements IBiSearch {

    public abstract int biSearch(int[] a, int length, int target);

    @Override
    public int search(int[] a, int target) {
        int n = a.length;
        if (n <= 0) return -1;
        return biSearch(a, n, target);
    }
}
