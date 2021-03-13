package com.wenmq.leetcode;

import com.wenmq.algo.base.ListNode;
import com.wenmq.tools.ListNodeTools;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution147UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution147";
    private Solution147 mSolution147;


    @Before
    public void setUp() throws Exception {
        mSolution147 = new Solution147();
    }

    @Test
    public void testInsertionSortList_Case1() {
        ListNode head = new ListNode(4);
        head.appendNewNode(2)
                .appendNewNode(1)
                .appendNewNode(3);
        head = mSolution147.insertionSortList(head);
        String actual = ListNodeTools.getListNodeString(head);

        ListNode expectedHead = new ListNode(1);
        expectedHead.appendNewNode(2)
                .appendNewNode(3)
                .appendNewNode(4);
        String expected = ListNodeTools.getListNodeString(expectedHead);
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testInsertionSortList_Case2() {
        ListNode head = new ListNode(-1);
        head.appendNewNode(5)
                .appendNewNode(3)
                .appendNewNode(4)
                .appendNewNode(0);
        head = mSolution147.insertionSortList(head);
        String actual = ListNodeTools.getListNodeString(head);

        ListNode expectedHead = new ListNode(-1);
        expectedHead.appendNewNode(0)
                .appendNewNode(3)
                .appendNewNode(4)
                .appendNewNode(5);
        String expected = ListNodeTools.getListNodeString(expectedHead);
        Assert.assertEquals(expected, actual);
    }


}