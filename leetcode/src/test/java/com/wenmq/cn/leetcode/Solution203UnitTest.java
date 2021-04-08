package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.wenmq.cn.leetcode.Solution203.ListNode;

public class Solution203UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution203";

    private Solution203 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution203();
    }

    @Test
    public void testRemoveElements_Case1() {
        ListNode node = generateList(new int[]{1, 2, 6, 3, 4, 5, 6});
        node = mTestSolution.removeElements(node, 6);
        ListNode expected = generateList(new int[]{1, 2, 3, 4, 5});
        assertListNode(expected, node);
    }

    @Test
    public void testRemoveElements_Case2() {
        ListNode node = generateList(new int[]{});
        node = mTestSolution.removeElements(node, 1);
        ListNode expected = generateList(new int[]{});
        assertListNode(expected, node);
    }

    @Test
    public void testRemoveElements_Case3() {
        ListNode node = generateList(new int[]{7, 7, 7, 7});
        node = mTestSolution.removeElements(node, 7);
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