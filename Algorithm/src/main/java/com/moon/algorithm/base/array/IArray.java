package com.moon.algorithm.base.array;

import java.util.ArrayList;
import java.util.List;

public interface IArray {
    default int[] sum(int[] a, int target) {
        return new int[]{};
    }
    default List<List<Integer>> sum2(int[] nums, int target) {
        return new ArrayList<>();
    }
}
