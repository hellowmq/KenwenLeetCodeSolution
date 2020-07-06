package com.wenmq.algo.linklist;

/**
 * @author ifans.wen
 * @date 2020/7/3
 * @description
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    ListNode appendNewNode(int newNodeV) {
        this.next = new ListNode(newNodeV);
        return this.next;
    }

    ListNode appendNode(ListNode newNode) {
        this.next = newNode;
        return this.next;
    }

}
