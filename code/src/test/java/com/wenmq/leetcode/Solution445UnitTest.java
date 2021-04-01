package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.wenmq.leetcode.Solution445.ListNode;

public class Solution445UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution445";
    private Solution445 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution445();
    }

    @Test
    public void testAddTwoNumbers_Case1() {
        ListNode l1 = generateList(new int[]{7, 2, 4, 3});
        ListNode l2 = generateList(new int[]{5, 6, 4});
        ListNode expected = generateList(new int[]{7, 8, 0, 7});
        ListNode actual = mTestSolution.addTwoNumbers(l1, l2);
        assertListNode(expected, actual);
    }

    @Test
    public void testAddTwoNumbers2_Case1() {
        ListNode l1 = generateList(new int[]{7, 2, 4, 3});
        ListNode l2 = generateList(new int[]{5, 6, 4});
        ListNode expected = generateList(new int[]{7, 8, 0, 7});
        ListNode actual = mTestSolution.addTwoNumbers2(l1, l2);
        assertListNode(expected, actual);
    }

    @Test
    public void testAddTwoNumbers2_Case2() {
        ListNode l1 = generateList(new int[]{7, 2, 4, 3});
        ListNode l2 = generateList(new int[]{3, 5, 6, 4});
        ListNode expected = generateList(new int[]{1, 0, 8, 0, 7});
        ListNode actual = mTestSolution.addTwoNumbers2(l1, l2);
        assertListNode(expected, actual);
    }

    @Test
    public void errorTestAddTwoNumbers_CaseEmpty() {
        ListNode l1 = generateList(new int[]{7, 2, 4, 3});
        ListNode l2 = null;
        ListNode expected = generateList(new int[]{7, 2, 4, 3});
        ListNode actual = mTestSolution.addTwoNumbers2(l1, l2);
        assertListNode(expected, actual);
    }

    private void assertListNode(ListNode expected, ListNode actual) {
        while (expected != actual) {
            Assert.assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        Assert.assertNull(actual);
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