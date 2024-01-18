package com.leetcode.offer;

public class ObjectEqual {
    public static void main(String[] args) {
//        Integer a = 200;
//        Integer b = 200;
//        boolean equal1 = a.equals(b); // true
//        boolean equal2 = a == b; // false
//        System.out.println(equal1);
//        System.out.println(equal2);
//
//        String s = "sddddddddddddd";
//        String s1 = "sddddddddddddd";
//        System.out.println(s.equals(s1)); // true
//        System.out.println(s == s1); // true
//        String s3 = s1.intern();
//        System.out.println(s == s1); // true

        Long l = new Long(10000L);
        Long l1 = 10000L;
        System.out.println(l == l1); // false
        System.out.println(l.equals(l1)); // ture

        Integer i = new Integer(1);
        Integer li = 1;
        System.out.println(i == li); // false
        System.out.println(i.equals(li)); // ture
    }
}
