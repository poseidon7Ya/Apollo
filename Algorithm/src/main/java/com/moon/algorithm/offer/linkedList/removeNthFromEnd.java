package com.moon.algorithm.offer.linkedList;

import com.moon.algorithm.base.linkedList.AbstractLinkedList;
import com.moon.algorithm.base.linkedList.ListNode;
import com.moon.algorithm.base.solution.IDummy;
import com.moon.algorithm.base.solution.ITwoPointer;

/**
 * 删除倒数第k个节点
 * 如果给定一个链表，请问如何删除链表中的倒数第k个节
 * 点？假设链表中节点的总数为n，那么1≤k≤n。要求只能遍历链表
 * 一次。
 */
public class removeNthFromEnd extends AbstractLinkedList implements IDummy, ITwoPointer {

    @Override
    public ListNode delete(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = head, slow = dummy;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
