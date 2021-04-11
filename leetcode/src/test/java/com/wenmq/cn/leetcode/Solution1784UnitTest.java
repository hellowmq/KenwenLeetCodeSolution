package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1784UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1784";

    private Solution1784 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1784();
    }

    @Test
    public void testCheckOnesSegment_Case1() {
        String s = "1001";
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.checkOnesSegment(s));
    }

    @Test
    public void testCheckOnesSegment_Case2() {
        String s = "110";
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.checkOnesSegment(s));
    }
}