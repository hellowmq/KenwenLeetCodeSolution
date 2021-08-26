package com.wenmq.cn.leetcode;

import com.wenmq.cn.leetcode.Solution141.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution141UnitTest {

    private Solution141 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution141();
    }

    @Test
    public void test_hasCycle_Case1() {
        ListNode head = generateList(new int[]{
                3, 2, 0, -4
        });
        head.next.next.next.next = head.next;
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.hasCycle(head));
    }

    @Test
    public void test_hasCycle_Case2() {
        ListNode head = generateList(new int[]{
                1, 2
        });
        head.next.next = head;
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.hasCycle(head));
    }

    @Test
    public void test_hasCycle_Case3() {
        ListNode head = generateList(new int[]{
                1
        });
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.hasCycle(head));
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
}