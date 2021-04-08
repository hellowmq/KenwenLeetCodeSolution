package com.wenmq.cn.leetcode;

import com.wenmq.algo.base.ListNode;

/**
 * Q86
 * https://leetcode-cn.com/problems/partition-list/
 */
public class Solution86 {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */

    public ListNode partition(ListNode head, int x) {
        ListNode lessDump = new ListNode(0);
        lessDump.next = null;
        ListNode lessThan = lessDump;
        ListNode largerDump = new ListNode(0);
        largerDump.next = null;
        ListNode largerThan = largerDump;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val >= x) {
                largerThan.next = cur;
                cur = cur.next;
                largerThan = largerThan.next;
            } else {
                lessThan.next = cur;
                cur = cur.next;
                lessThan = lessThan.next;
            }
        }
        lessThan.next = largerDump.next;
        largerThan.next = null;
        return lessDump.next;
    }

}
