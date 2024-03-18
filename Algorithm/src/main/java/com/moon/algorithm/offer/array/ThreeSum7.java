package com.moon.algorithm.offer.array;

import com.moon.algorithm.base.array.AbstractArray;
import com.moon.algorithm.base.solution.ITwoPointer;
import com.moon.algorithm.base.sort.ISort;

import java.util.*;

/**
 * 数组中和为0的3个数字
 * 输入一个数组，如何找出数组中所有和为0的3个数字的
 * 三元组？需要注意的是，返回值中不得包含重复的三元组。例如，
 * 在数组[-1，0，1，2，-1，-4]中有两个三元组的和为0，它们分别
 * 是[-1，0，1]和[-1，-1，2]。
 * <a href="https://leetcode.com/problems/3sum/solutions/">...</a>
 */
public class ThreeSum7 extends AbstractArray implements ISort, ITwoPointer {

    @Override
    public List<List<Integer>> sum2(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        if (n < 3) return list;
        Set<List<Integer>> set = new HashSet<>();
        sort(nums);
        for (int i = 0; i < n; i++) {
            int j = i + 1, k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    // notice this
                    j++;
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        list.addAll(set);
        return list;
    }

    @Override
    public void sort(int[] a) {
        Arrays.sort(a);
    }
}
