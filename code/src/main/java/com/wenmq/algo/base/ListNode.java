package com.wenmq.algo.base;

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
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }


    public ListNode appendNewNode(int newNodeV) {
        this.next = new ListNode(newNodeV);
        return this.next;
    }


    public ListNode appendNode(ListNode newNode) {
        this.next = newNode;
        return this.next;
    }

}
