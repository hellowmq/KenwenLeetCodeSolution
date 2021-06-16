package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1646UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1646";

    private Solution1646 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1646();
    }

    @Test
    public void testGetMaximumGenerated_Case1() {
        int n = 7;
        int expected = 3;
        Assert.assertEquals(expected, mTestSolution.getMaximumGenerated(n));
    }

    @Test
    public void testGetMaximumGenerated_Case2() {
        int n = 2;
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.getMaximumGenerated(n));
    }

    @Test
    public void testGetMaximumGenerated_Case3() {
        int n = 3;
        int expected = 2;
        Assert.assertEquals(expected, mTestSolution.getMaximumGenerated(n));
    }

    @Test
    public void testGetMaximumGenerated_Case4() {
        int n = 99;
        int expected = 21;
        Assert.assertEquals(expected, mTestSolution.getMaximumGenerated(n));
    }

    @Test
    public void testGetMaximumGenerated_Case5() {
        int n = 1;
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.getMaximumGenerated(n));
    }

}