package com.wenmq.leetcode;

import com.wenmq.algo.base.ListNode;
import com.wenmq.tools.ListNodeTools;

/**
 * Q148
 * https://leetcode-cn.com/problems/remove-linked-list-elements/
 */
public class Q203 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    static class Solution {
        public ListNode removeElements(ListNode head, int val) {
            if (head == null) return null;
            ListNode dump = new ListNode(0);
            dump.next = head;
            ListNode cur = dump;
            while (cur.next != null) {
                if (cur.next.val == val) {
                    cur.next = cur.next.next;
                } else {
                    cur = cur.next;
                }
            }
            return dump.next;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode a = new ListNode(5);
        ListNode b = null;
        ListNode c = new ListNode(1);
        c.appendNewNode(4)
                .appendNewNode(3)
                .appendNewNode(2)
                .appendNewNode(5)
                .appendNewNode(2);
        ListNodeTools.printListNode(a);
        solution.removeElements(a, 5);
        ListNodeTools.printListNode(a);
    }

}
