package com.wenmq.leetcode;

import com.wenmq.algo.base.ListNode;
import com.wenmq.tools.ListNodeTools;

/**
 * Q147
 * https://leetcode-cn.com/problems/insertion-sort-list/comments/
 */
public class Q147 {
    static class Solution {
        public ListNode insertionSortList(ListNode head) {
            ListNode dummy = new ListNode(0);
            ListNode pre;
            dummy.next = head;
            while (head != null && head.next != null) {
                if (head.val <= head.next.val) {
                    head = head.next;
                    continue;
                }
                pre = dummy;
                while (pre.next.val < head.next.val) {
                    pre = pre.next;
                }
                /// find out which place should insert in;
                ListNode cur = head.next;
                head.next = cur.next;
                cur.next = pre.next;
                pre.next = cur;
            }
            return dummy.next;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode sample1 = new ListNode(4);
        sample1.appendNewNode(2)
                .appendNewNode(1)
                .appendNewNode(3);
        ListNodeTools.printListNode(sample1);
        sample1 = solution.insertionSortList(sample1);
        ListNodeTools.printListNode(sample1);
        ListNode sample2 = new ListNode(-1);
        sample2.appendNewNode(5)
                .appendNewNode(3)
                .appendNewNode(4)
                .appendNewNode(0);
        ListNodeTools.printListNode(sample2);
        sample2 = solution.insertionSortList(sample2);
        ListNodeTools.printListNode(sample2);


    }
}
