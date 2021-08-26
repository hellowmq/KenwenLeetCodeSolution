package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/">
 * Q19
 * </a>
 */
public class Solution19 {
    /**
     * 链表中结点的数目为 sz
     * 1 <= sz <= 30
     * 0 <= Node.val <= 100
     * 1 <= n <= sz
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode fast = dummyNode.next;
        while (--n > 0) {
            fast = fast.next;
        }
        ListNode slow = dummyNode;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummyNode.next;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

    }

}
