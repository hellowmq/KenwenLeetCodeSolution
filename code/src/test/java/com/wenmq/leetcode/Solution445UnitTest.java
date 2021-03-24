package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution445UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution445";
    private Solution445 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution445();
    }

    @Test
    public void testAddTwoNumbers_Case1() {
        Solution445.ListNode l1 = generateList(new int[]{7, 2, 4, 3});
        Solution445.ListNode l2 = generateList(new int[]{5, 6, 4});
        Solution445.ListNode expected = generateList(new int[]{7, 8, 0, 7});
        Solution445.ListNode actual = mTestSolution.addTwoNumbers(l1, l2);
        assertListNode(expected, actual);
    }

    @Test
    public void testAddTwoNumbers_Case2() {
        Solution445.ListNode l1 = generateList(new int[]{7, 2, 4, 3});
        Solution445.ListNode l2 = generateList(new int[]{5, 6, 4});
        Solution445.ListNode expected = generateList(new int[]{7, 8, 0, 7});
        Solution445.ListNode actual = mTestSolution.addTwoNumbers2(l1, l2);
        assertListNode(expected, actual);
    }

    /**
     *
     */
    @Test
    public void errorTestAddTwoNumbers_CaseEmpty() {
        Solution445.ListNode l1 = generateList(new int[]{7, 2, 4, 3});
        Solution445.ListNode l2 = null;
        Solution445.ListNode expected = generateList(new int[]{7, 2, 4, 3});
        Solution445.ListNode actual = mTestSolution.addTwoNumbers2(l1, l2);
        assertListNode(expected, actual);
    }

    private void assertListNode(Solution445.ListNode expected, Solution445.ListNode actual) {
        while (expected != actual) {
            Assert.assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        Assert.assertNull(actual);
    }

    public Solution445.ListNode generateList(int[] list) {
        if (list == null || list.length == 0) {
            return null;
        }
        Solution445.ListNode head = new Solution445.ListNode(list[0]);
        Solution445.ListNode node = head;
        for (int i = 1; i < list.length; i++) {
            node.next = new Solution445.ListNode(list[i]);
            node = node.next;
        }
        return head;

    }
}