package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.wenmq.cn.leetcode.Solution148.ListNode;

public class Solution148UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution148";

    private Solution148 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution148();
    }

    @Test
    public void testSortList_Case1() {
        ListNode node = generateList(new int[]{4, 2, 1, 3});
        node = mTestSolution.sortList(node);
        ListNode expected = generateList(new int[]{1, 2, 3, 4});
        assertListNode(expected, node);
    }

    @Test
    public void testSortList_Case2() {
        ListNode node = generateList(new int[]{-1, 5, 3, 4, 0});
        node = mTestSolution.sortList(node);
        ListNode expected = generateList(new int[]{-1, 0, 3, 4, 5});
        assertListNode(expected, node);
    }

    @Test
    public void testSortList_Case3() {
        ListNode node = generateList(new int[]{});
        node = mTestSolution.sortList(node);
        ListNode expected = generateList(new int[]{});
        assertListNode(expected, node);
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