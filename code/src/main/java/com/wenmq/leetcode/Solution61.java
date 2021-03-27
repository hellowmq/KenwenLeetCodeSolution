package com.wenmq.leetcode;

/**
 * Q61
 * https://leetcode-cn.com/problems/rotate-list/
 */
public class Solution61 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode head1 = head;
        int i1 = 0;
        while (head1 != null) {
            i1++;
            head1 = head1.next;
        }

        int length = i1;
        k = k % length;
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        fast.next = head;

        head = slow.next;
        slow.next = null;
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

}
