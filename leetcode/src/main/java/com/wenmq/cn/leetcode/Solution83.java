package com.wenmq.cn.leetcode;

/**
 * Q83
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 */
public class Solution83 {

    static class ListNode {
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

    public ListNode deleteDuplicates2(ListNode head) {
        ListNode node = head;
        while (node != null && node.next != null) {
            if (node.next.val == node.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }
}
