package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.wenmq.leetcode.Solution82.ListNode;

public class Solution82UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution82";
    private Solution82 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution82();
    }

    @Test
    public void testDeleteDuplicates_Case1() {
        ListNode node = generateList(new int[]{1, 2, 3, 3, 4, 4, 5});
        ListNode expected = generateList(new int[]{1, 2, 5});
        ListNode actual = mTestSolution.deleteDuplicates(node);
        assertListNode(expected, actual);
    }

    @Test
    public void testDeleteDuplicates_Case2() {
        ListNode node = generateList(new int[]{1, 1, 1, 2, 3});
        ListNode expected = generateList(new int[]{2, 3});
        ListNode actual = mTestSolution.deleteDuplicates(node);
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