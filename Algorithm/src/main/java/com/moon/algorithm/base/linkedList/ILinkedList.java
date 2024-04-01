package com.moon.algorithm.base.linkedList;

public interface ILinkedList {
    default ListNode delete(ListNode head, int k) {
        return new ListNode(0);
    }

    default ListNode find(ListNode head) {
        return new ListNode(0);
    }
}
