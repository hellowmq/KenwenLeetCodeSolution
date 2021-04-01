package com.wenmq.leetcode;

import com.wenmq.algo.base.ListNode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution160UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution160";
    private Solution160 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution160();
    }

    /**
     * intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
     */
    @Test
    public void testGetIntersectionNode_Case1() {
        ListNode commonLink = new ListNode(8)
                .appendNewNode(4)
                .appendNewNode(5);
        ListNode listA = new ListNode(4);
        listA.appendNewNode(1)
                .appendNode(commonLink);
        ListNode listB = new ListNode(5);
        listB.appendNewNode(0)
                .appendNewNode(1)
                .appendNode(commonLink);
        ListNode actual = mTestSolution.getIntersectionNode(listA, listB);
        Assert.assertEquals(commonLink, actual);
    }

    /**
     * intersectVal = 2, listA = [0,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
     */
    @Test
    public void testGetIntersectionNode_Case2() {
        ListNode commonLink = new ListNode(2)
                .appendNewNode(4);
        ListNode listA = new ListNode(0);
        listA.appendNewNode(9)
                .appendNewNode(1)
                .appendNode(commonLink);
        ListNode listB = new ListNode(3);
        listB.appendNode(commonLink);
        ListNode actual = mTestSolution.getIntersectionNode(listA, listB);
        Assert.assertEquals(commonLink, actual);
    }

    /**
     * intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
     */
    @Test
    public void testGetIntersectionNode_Case3() {
        final ListNode commonLink = null;
        ListNode listA = new ListNode(2);
        listA.appendNewNode(6)
        .appendNewNode(4);
        ListNode listB = new ListNode(1);
        listB.appendNewNode(5);
        ListNode actual = mTestSolution.getIntersectionNode(listA, listB);
        Assert.assertEquals(commonLink, actual);
    }


}