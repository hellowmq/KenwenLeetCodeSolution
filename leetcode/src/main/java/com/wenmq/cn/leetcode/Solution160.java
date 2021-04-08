package com.wenmq.cn.leetcode;

/**
 * Q160
 * https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 */
public class Solution160 {
    /**
     * Floyd 判圈法
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != curB) {
            curA = curA == null ? headB : curA.next;
            curB = curB == null ? headA : curB.next;
        }
        return curA;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
