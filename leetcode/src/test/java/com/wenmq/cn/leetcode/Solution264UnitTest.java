package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Solution264UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution264";

    private Solution264 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution264();
    }

    @Test
    public void testNthUglyNumber_Case1() {
        int n = 10;
        int expected = 12;
        Assert.assertEquals(expected, mTestSolution.nthUglyNumber(n));
    }

    @Test
    public void testNthUglyNumber_Case2() {
        int n = 1;
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.nthUglyNumber(n));
    }

    @Test
    public void testNthUglyNumber_Case3() {
        int n = 1352;
        int expected = 402653184;
        Assert.assertEquals(expected, mTestSolution.nthUglyNumber(n));
    }

}