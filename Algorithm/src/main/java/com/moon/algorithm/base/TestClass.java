package com.moon.algorithm.base;

import com.alibaba.fastjson.JSONObject;
import com.moon.algorithm.base.array.IArray;
import com.moon.algorithm.base.search.ISearch;
import com.moon.algorithm.base.sort.ISort;
import com.moon.algorithm.base.string.StrInterface;
import com.moon.algorithm.offer.array.MinSubArrayLen;
import com.moon.algorithm.offer.array.MinSubArrayLen_1;
import com.moon.algorithm.offer.array.TwoSum6_1;

import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
//        int[] a = new int[]{6, 5, 4, 3, 1, 2, 0, 11, 12, 23};
        int[] b = new int[]{5, 6, 7, 5, 4, 3, 2, 1};
        int[] c = new int[]{1, 1, 2, 2, 3, 3, 4, 5, 5};
//        sort(new QuickSort(), a);
//        sort2(a);
//        biS(new SingleNonDuplicate70(), c, 0);
//        str();
//        biS(new lengthOfLongestSubString16_1(), "cbaebabacd", "abc");
//        palindrome(new ValidPalindrome19(), "abca", "");
//        palindromeCount(new CountSubPalindrome20(), "abca");
//        array(new TwoSum6_1(), new int[]{3, 2, 4}, 6);
        subArray(new MinSubArrayLen_1(), new int[]{5, 1, 4, 3}, 7);
    }

    public static void subArray(IArray array, int[] nms, int target) {
        System.out.println(array.subArray(nms, target));
    }

    public static void array(IArray array, int[] nms, int target) {
        System.out.println(Arrays.toString(array.sum(nms, target)));
    }

    public static void biS(StrInterface strInterface, String s, String p) {
        System.out.println(JSONObject.toJSONString(strInterface.longestSubString(s)));
    }

    public static void palindrome(StrInterface strInterface, String s, String p) {
        System.out.println(JSONObject.toJSONString(strInterface.palindrome(s)));
    }

    public static void palindromeCount(StrInterface strInterface, String s) {
        System.out.println(strInterface.palindromeCount(s));
    }

    public static void biS(ISearch search, int[] a, int target) {
        System.out.println(search.search(a, target));
    }

    public static void sort(ISort sort, int[] a) {
        System.out.println("====================sort1====================");
        sort.sort(a);
        print(a);
    }

    public static void sort2(int[] a) {
        Arrays.sort(a);
        System.out.println("====================Arrays.sort()====================");
        print(a);
    }

    public static void print(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}
