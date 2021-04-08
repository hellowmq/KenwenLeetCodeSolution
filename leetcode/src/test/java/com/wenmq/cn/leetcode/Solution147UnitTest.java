package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.wenmq.cn.leetcode.Solution147.ListNode;

public class Solution147UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution147";
    private Solution147 mSolution147;


    @Before
    public void setUp() throws Exception {
        mSolution147 = new Solution147();
    }

    @Test
    public void testInsertionSortList_Case1() {
        ListNode head = generateList(new int[]{4, 2, 1, 3});
        ListNode actual = mSolution147.insertionSortList(head);

        ListNode expectedHead = generateList(new int[]{1, 2, 3, 4});
        assertListNode(expectedHead, actual);
    }

    @Test
    public void testInsertionSortList_Case2() {
        ListNode head = generateList(new int[]{-1, 5, 3, 4, 0});

        ListNode actual = mSolution147.insertionSortList(head);

        ListNode expectedHead = generateList(new int[]{-1, 0, 3, 4, 5});
        assertListNode(expectedHead, actual);
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