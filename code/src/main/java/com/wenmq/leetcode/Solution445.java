package com.wenmq.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Q445
 * https://leetcode-cn.com/problems/add-two-numbers-ii/
 */
public class Solution445 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 方法一：
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> stack1 = getStack(l1);
        Deque<Integer> stack2 = getStack(l2);
        ListNode head = null;
        int carry = 0;
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {
            int a = (stack1.isEmpty()) ? 0 : stack1.pop();
            int b = (stack2.isEmpty()) ? 0 : stack2.pop();
            int sum = a + b + carry;
            int res = sum % 10;
            carry = sum / 10;
            ListNode newNode = new ListNode(res);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    private Deque<Integer> getStack(ListNode head) {
        ListNode node = head;
        Deque<Integer> stack1 = new LinkedList<>();
        while (node != null) {
            stack1.push(node.val);
            node = node.next;
        }
        return stack1;
    }


}
