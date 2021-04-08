package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.wenmq.cn.leetcode.Solution83.ListNode;

public class Solution83UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution83";

    private Solution83 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution83();
    }

    @Test
    public void testDeleteDuplicates_Case1() {
        ListNode head = generateList(new int[]{1, 1, 2});
        ListNode expected = generateList(new int[]{1, 2});
        head = mTestSolution.deleteDuplicates(head);
        assertListNode(expected, head);
    }

    @Test
    public void testDeleteDuplicates_Case2() {
        ListNode head = generateList(new int[]{1, 1, 2, 3, 3});
        ListNode expected = generateList(new int[]{1, 2, 3});
        head = mTestSolution.deleteDuplicates(head);
        assertListNode(expected, head);
    }

    @Test
    public void testDeleteDuplicates_Case3() {
        ListNode head = generateList(new int[]{1});
        ListNode expected = generateList(new int[]{1});
        head = mTestSolution.deleteDuplicates(head);
        assertListNode(expected, head);
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