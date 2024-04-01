package com.moon.algorithm.offer.linkedList;

import com.moon.algorithm.base.linkedList.AbstractLinkedList;
import com.moon.algorithm.base.linkedList.ListNode;
import com.moon.algorithm.base.solution.IDummy;
import com.moon.algorithm.base.solution.ITwoPointer;

import java.util.Objects;

/**
 * 面试题22：链表中环的入口节点
 * 如果一个链表中包含环，那么应该如何找出环的入口节
 * 点？从链表的头节点开始顺着next指针方向进入环的第1个节点为环
 * 的入口节点。例如，在如图4.3所示的链表中，环的入口节点是节点
 * 3。
 */
public class GetNodeInLoop extends AbstractLinkedList implements IDummy, ITwoPointer {

    @Override
    public ListNode find(ListNode head) {
        if (Objects.isNull(head) || Objects.isNull(head.next)) return null;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next; // fast 的位置是 slow 的两倍
            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }
}
