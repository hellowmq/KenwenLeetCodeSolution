package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution551UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution551";


    private Solution551 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution551();
    }

    @Test
    public void testCheckRecord_Case1() {
        String s = "PPALLP";
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.checkRecord(s));
    }

    @Test
    public void testCheckRecord_Case2() {
        String s = "PPALLL";
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.checkRecord(s));
    }

    @Test
    public void testCheckRecord_Case3() {
        String s = "AAAA";
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.checkRecord(s));
    }
}