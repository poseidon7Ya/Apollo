package com.leetcode.offer;

public class ThreadD {
    public static void main(String[] args) {
        System.out.println("dddd");
        Thread thread = new Thread(() -> System.out.println("ddddd"));
        thread.start();
    }

}
