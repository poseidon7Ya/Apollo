package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组
 */
public class Solution {
    /**
     * 排序数组中的两个数字之和 。 排序----> 二分查找
     * <p>
     * 输入一个递增排序的数组和一个值k，请问如何在数组中
     * 找出两个和为k的数字并返回它们的下标？假设数组中存在且只存在
     * 一对符合条件的数字，同时一个数字不能使用两次。例如，输入数
     * 组[1，2，4，6，10]，k的值为8，数组中的数字2与6的和为8，它们
     * 的下标分别为1与3。
     */
    public static int[] solution1(int[] a, int target) {
        // 双指针
        int i = 0, j = a.length - 1;
        while ((a[i] + a[j]) != target && i < j) {
            int r = a[i] + a[j];
            if (target < r) {
                j --;
            } else {
                i ++;
            }
        }
        return new int[]{i, j};
    }

    /**
     * 输入一个数组，如何找出数组中所有和为0的3个数字的
     * 三元组？需要注意的是，返回值中不得包含重复的三元组。例如，
     * 在数组[-1，0，1，2，-1，-4]中有两个三元组的和为0，它们分别
     * 是[-1，0，1]和[-1，-1，2]。
     * @param a
     * @param
     * @return
     */
    public static List<List<Integer>> solution2(int[] a) {
        List<List<Integer>> resultList = new ArrayList<>();
//        if (a.length < 3) {
//            return resultList;
//        }
//        // 排序
//        Arrays.sort(a);
        return resultList;
    }






}


