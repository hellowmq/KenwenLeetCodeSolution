package com.wenmq.leetcode;

import com.wenmq.algo.base.ListNode;
import com.wenmq.tools.ListNodeTools;

/**
 * Q148
 * https://leetcode-cn.com/problems/sort-list/
 */
public class Q148 {
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
    static class Solution {
        public ListNode sortList(ListNode head) {
            return null;
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
    }

}
