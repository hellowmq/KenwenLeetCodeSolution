package com.wenmq.cn.leetcode;

import com.wenmq.algo.base.ListNode;
import com.wenmq.tools.ListNodeTools;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution86UnitTest {
    public static final String TAG = "com.wenmq.cn.leetcode.Solution86";
    private Solution86 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution86();
    }

    @Test
    public void testPartition_Case86() {
        // 1->4->3->2->5->2
        ListNode head = new ListNode(1);
        head.appendNewNode(4)
                .appendNewNode(3)
                .appendNewNode(2)
                .appendNewNode(5)
                .appendNewNode(2);
        ListNode resultNode = mTestSolution.partition(head, 3);
        // 1->2->2->4->3->5
        int[] expect = new int[]{1, 2, 2, 4, 3, 5};
        int[] actual = ListNodeTools.toArray(resultNode);
        Assert.assertArrayEquals(expect, actual);
    }
}