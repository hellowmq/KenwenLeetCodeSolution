package com.wenmq.leetcode;

/**
 * Q83
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 */
public class Solution83 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        if (cur == null || cur.next == null) {
            return head;
        }
        ListNode next = head.next;
        while (next != null) {
            if (cur.val == next.val) {
                cur.next = next = next.next;
            } else {
                cur = next;
                next = next.next;
            }
        }
        return head;
    }
}
