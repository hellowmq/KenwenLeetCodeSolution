package com.wenmq.cn.leetcode;

import static com.wenmq.cn.leetcode.Solution19.ListNode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution19UnitTest {

    private Solution19 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution19();
    }

    @Test
    public void test_RemoveNthFromEnd_Case1() {
        ListNode head = generateList(new int[]{
                1, 2, 3, 4, 5
        });
        int n = 2;
        ListNode newHead = mTestSolution.removeNthFromEnd(head, n);
        ListNode expected = generateList(new int[]{
                1, 2, 3, 5
        });
        assertListNode(expected, newHead);
    }

    @Test
    public void test_RemoveNthFromEnd_Case2() {
        ListNode head = generateList(new int[]{
                1
        });
        int n = 1;
        ListNode newHead = mTestSolution.removeNthFromEnd(head, n);
        ListNode expected = generateList(new int[]{
        });
        assertListNode(expected, newHead);
    }

    @Test
    public void test_RemoveNthFromEnd_Case3() {
        ListNode head = generateList(new int[]{
                1, 2
        });
        int n = 1;
        ListNode newHead = mTestSolution.removeNthFromEnd(head, n);
        ListNode expected = generateList(new int[]{
                1
        });
        assertListNode(expected, newHead);
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