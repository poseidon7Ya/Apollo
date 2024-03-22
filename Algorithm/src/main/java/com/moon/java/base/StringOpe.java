package com.moon.java.base;

public class StringOpe {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hel" + new String("lo");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        String s3 = s2.intern();
        System.out.println(s1 == s3);

        Long l = new Long(10000L);
        Long l1 = 10000L;
        System.out.println(l == l1);
        System.out.println(l.equals(l1));
    }
}
