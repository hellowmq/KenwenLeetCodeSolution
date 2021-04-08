package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.wenmq.cn.leetcode.Solution61.ListNode;

public class Solution61UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution61";

    private Solution61 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution61();
    }

    @Test
    public void testRotateRight_Case1() {
        ListNode node = generateList(new int[]{1, 2, 3, 4, 5});
        int k = 2;
        ListNode expected = generateList(new int[]{4, 5, 1, 2, 3});
        ListNode actual = mTestSolution.rotateRight(node, k);
        assertListNode(expected, actual);
    }

    @Test
    public void testRotateRight_Case2() {
        ListNode node = generateList(new int[]{0, 1, 2});
        int k = 4;
        ListNode expected = generateList(new int[]{2, 0, 1});
        ListNode actual = mTestSolution.rotateRight(node, k);
        assertListNode(expected, actual);
    }

    @Test
    public void testRotateRight_Case3() {
        ListNode node = generateList(new int[]{});
        int k = 0;
        ListNode expected = generateList(new int[]{});
        ListNode actual = mTestSolution.rotateRight(node, k);
        assertListNode(expected, actual);
    }


    /**
     * 平时做算法题和面试做算法题的一个很大区别
     * 面试做算法题，思路是暴露出来的
     * 因此，很多开发的方法论需要借此体现
     */
    @Test
    public void testRotateRight_Case4() {
        ListNode node = generateList(new int[]{1});
        int k = 0;
        ListNode expected = generateList(new int[]{1});
        ListNode actual = mTestSolution.rotateRight(node, k);
        assertListNode(expected, actual);
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

    private void assertListNode(ListNode expected, ListNode actual) {
        while (expected != actual) {
            Assert.assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        Assert.assertNull(actual);
    }

}