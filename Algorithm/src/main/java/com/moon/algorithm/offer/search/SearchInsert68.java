package com.moon.algorithm.offer.search;

import com.moon.algorithm.base.search.BiSearchFstEqOrGe;
import com.moon.algorithm.base.search.Search;

/**
 * 面试题68：查找插入位置
 * 输入一个排序的整数数组nums和一个目标值t，如果数组
 * nums中包含t，则返回t在数组中的下标；如果数组nums中不包含t，
 * 则返回将t按顺序插入数组nums中的下标。假设数组中没有相同的数
 * 字。例如，输入数组nums为[1，3，6，8]，如果目标值t为3，则输
 * 出1；如果t为5，则返回2。
 */
public class SearchInsert68 implements Search {

    @Override
    public int search(int[] a, int target) {
        Search search = new BiSearchFstEqOrGe();
        int result = search.search(a, target);
        return result == -1 ? a.length : result;
    }
}
