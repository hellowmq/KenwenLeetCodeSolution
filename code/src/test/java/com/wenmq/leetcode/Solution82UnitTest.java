package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution82UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution82";
    private Solution82 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution82();
    }

    @Test
    public void testDeleteDuplicates_Case1() {
        Solution82.ListNode node = generateList(new int[]{1, 2, 3, 3, 4, 4, 5});
        Solution82.ListNode expected = generateList(new int[]{1, 2, 5});
        Solution82.ListNode actual = mTestSolution.deleteDuplicates(node);
        assertListNode(expected, actual);
    }

    @Test
    public void testDeleteDuplicates_Case2() {
        Solution82.ListNode node = generateList(new int[]{1, 1, 1, 2, 3});
        Solution82.ListNode expected = generateList(new int[]{2, 3});
        Solution82.ListNode actual = mTestSolution.deleteDuplicates(node);
        assertListNode(expected, actual);
    }


    public Solution82.ListNode generateList(int[] list) {
        if (list == null || list.length == 0) {
            return null;
        }
        Solution82.ListNode head = new Solution82.ListNode(list[0]);
        Solution82.ListNode node = head;
        for (int i = 1; i < list.length; i++) {
            node.next = new Solution82.ListNode(list[i]);
            node = node.next;
        }
        return head;

    }

    private void assertListNode(Solution82.ListNode expected, Solution82.ListNode actual) {
        while (expected != actual) {
            Assert.assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        Assert.assertNull(actual);
    }
}