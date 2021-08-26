package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/linked-list-cycle/">
 * Q141
 * </a>
 */
public class Solution141 {
    /**
     * 链表中节点的数目范围是 [0, 10^4]
     * -10^5 <= Node.val <= 10^5
     * pos 为 -1 或者链表中的一个 有效索引 。
     */
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
