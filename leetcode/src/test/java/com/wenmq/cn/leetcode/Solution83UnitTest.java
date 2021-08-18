package com.wenmq.cn.leetcode;

import static com.wenmq.cn.leetcode.Solution83.ListNode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution83UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution83";

    private Solution83 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution83();
    }

    @Test
    public void testDeleteDuplicates_Case1() {
        int[] inputList = {
                1, 1, 2
        };
        int[] expectedList = {
                1, 2
        };
        assertMoreSolution(inputList, expectedList);
    }

    @Test
    public void testDeleteDuplicates_Case2() {
        int[] inputList = {
                1, 1, 2, 3, 3
        };
        int[] expectedList = {
                1, 2, 3
        };
        assertMoreSolution(inputList, expectedList);
    }

    @Test
    public void testDeleteDuplicates_Case3() {
        int[] inputList = {
                1
        };
        int[] expectedList = {
                1
        };
        assertMoreSolution(inputList, expectedList);
    }

    private void assertMoreSolution(int[] inputList, int[] expectedList) {
        assertSolution(inputList, expectedList);
        assertSolution2(inputList, expectedList);
    }

    private void assertSolution(int[] inputList, int[] expectedList) {
        ListNode head = generateList(inputList);
        ListNode expected = generateList(expectedList);
        head = mTestSolution.deleteDuplicates(head);
        assertListNode(expected, head);
    }

    private void assertSolution2(int[] inputList, int[] expectedList) {
        ListNode head = generateList(inputList);
        ListNode expected = generateList(expectedList);
        head = mTestSolution.deleteDuplicates2(head);
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