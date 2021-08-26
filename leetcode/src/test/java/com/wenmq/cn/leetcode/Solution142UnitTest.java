package com.wenmq.cn.leetcode;

import static com.wenmq.cn.leetcode.Solution142.ListNode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution142UnitTest {

    private Solution142 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution142();
    }

    @Test
    public void test_DetectCycle_Case1() {
        int[] list = {
                3, 2, 0, -4
        };
        ListNode head = generateList(list);
        int pos = 1;
        getNodeAt(head, list.length - 1).next = getNodeAt(head, pos);
        ListNode expectedNode = getNodeAt(head, pos);
        Assert.assertEquals(expectedNode, mTestSolution.detectCycle(head));
    }


    @Test
    public void test_DetectCycle_Case2() {
        int[] list = {
                1, 2
        };
        ListNode head = generateList(list);
        int pos = 0;
        getNodeAt(head, list.length - 1).next = getNodeAt(head, pos);
        ListNode expectedNode = getNodeAt(head, pos);
        Assert.assertEquals(expectedNode, mTestSolution.detectCycle(head));
    }


    @Test
    public void test_DetectCycle_Case3() {
        int[] list = {
                1
        };
        ListNode head = generateList(list);
        int pos = -1;
        getNodeAt(head, list.length - 1).next = getNodeAt(head, pos);
        ListNode expectedNode = getNodeAt(head, pos);
        Assert.assertEquals(expectedNode, mTestSolution.detectCycle(head));
    }

    public ListNode generateList(int[] list) {
        if (list == null || list.length == 0) {
            return null;
        }
        ListNode head = new ListNode(list[0]);
        ListNode node = head;
        for (int i = 1; i < list.length; i++) {
            node.next = new ListNode(list[i]);
            node = node.next;
        }
        return head;
    }

    public ListNode getNodeAt(ListNode node, int index) {
        if (index == -1) {
            return null;
        }
        ListNode cur = node;
        while (index-- > 0) {
            cur = cur.next;
        }
        return cur;
    }
}