package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/middle-of-the-linked-list/">
 * Q876
 * </a>
 */
public class Solution876 {
    /**
     * head != null
     * 给定链表的结点数介于 1 和 100 之间。
     */
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
