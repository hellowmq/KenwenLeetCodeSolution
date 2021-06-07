package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.wenmq.cn.leetcode.Solution876.ListNode;

public class Solution876UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution876";

    private Solution876 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution876();
    }

    @Test
    public void testMiddleNode_Case1() {
        int[] list = {
                1, 2, 3, 4, 5
        };
        ListNode listNode = generateList(list);
        int expectedVal = 3;
        Assert.assertEquals(expectedVal, mTestSolution.middleNode(listNode).val);
    }

    @Test
    public void testMiddleNode_Case2() {
        int[] list = {
                1, 2, 3, 4, 5, 6
        };
        ListNode listNode = generateList(list);
        int expectedVal = 4;
        Assert.assertEquals(expectedVal, mTestSolution.middleNode(listNode).val);
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