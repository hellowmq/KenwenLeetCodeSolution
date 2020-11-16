package com.wenmq.leetcode;

import com.wenmq.algo.base.ListNode;
import com.wenmq.tools.ListNodeTools;

public class Q86 {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    static class Solution {
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

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode a = new ListNode(1);
        a.appendNewNode(4)
                .appendNewNode(3)
                .appendNewNode(2)
                .appendNewNode(5)
                .appendNewNode(2);
        ListNodeTools.printListNode(a);
//        ListNodeTools.printListNode(solution.partition(a, 3), 10);
//        ListNodeTools.printListNode(solution.partition(new ListNode(1), 2), 3);
        ListNode listNode = new ListNode(2);listNode.appendNewNode(1);
        ListNodeTools.printListNode(solution.partition(listNode, 2), 3);
    }

}
