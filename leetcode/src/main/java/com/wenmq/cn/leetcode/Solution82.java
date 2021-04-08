package com.wenmq.cn.leetcode;

/**
 * Q82
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii/
 */
public class Solution82 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * 删除重复出现的每一组元素
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = new ListNode(0, head);
        head = p;
        ListNode left;
        ListNode right;
        while (p.next != null) {
            left = p.next;
            right = left;
            while (right.next != null && right.next.val == left.val) {
                right = right.next;
            }
            if (left == right) {
                p = p.next;
            } else {
                p.next = right.next;
            }
        }
        return head.next;
    }

}
