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
     * 用缓冲区
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


    /**
     * 反转链表
     */
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        l1 = reverse(l1);
        l2 = reverse(l2);
        int carry = 0;
        ListNode result = null;
        ListNode temp = result;
        while (l1 != null || l2 != null) {
            int n1 = 0;
            int n2 = 0;
            int sum = 0;
            if (l1 != null) {
                n1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                n2 = l2.val;
                l2 = l2.next;
            }
            sum = n1 + n2 + carry;
            carry = sum / 10;
            if (result == null) {
                result = new ListNode(sum % 10);
                temp = result;
            } else {
                temp.next = new ListNode(sum % 10);
                temp = temp.next;
            }
        }
        if (carry != 0) {
            temp.next = new ListNode(carry);
        }
        return reverse(result);
    }

    public ListNode reverse(ListNode l) {
        ListNode preHead = new ListNode(0);
        preHead.next = l;
        ListNode temp = l;
        ListNode tail = l;
        ListNode cur = tail.next;
        while (cur != null) {
            temp = preHead.next;
            preHead.next = cur;
            tail.next = cur.next;
            cur.next = temp;
            cur = tail.next;
        }
        return preHead.next;
    }

}
