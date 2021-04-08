package com.wenmq.cn.leetcode;

import com.wenmq.cn.leetcode.Solution86.ListNode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution86UnitTest {
    public static final String TAG = "com.wenmq.cn.leetcode.Solution86";
    private Solution86 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution86();
    }

    @Test
    public void testPartition_Case1() {
        // 1->4->3->2->5->2
        ListNode head = generateList(new int[]{1, 4, 3, 2, 5, 2});
        int x = 3;

        ListNode actual = mTestSolution.partition(head, x);
        // 1->2->2->4->3->5
        ListNode expect = generateList(new int[]{1, 2, 2, 4, 3, 5});

        assertListNode(expect, actual);
    }

    @Test
    public void testPartition_Case2() {
        // 1->4->3->2->5->2
        ListNode head = generateList(new int[]{2, 1});
        int x = 2;

        ListNode actual = mTestSolution.partition(head, x);
        // 1->2->2->4->3->5
        ListNode expect = generateList(new int[]{1, 2});

        assertListNode(expect, actual);
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