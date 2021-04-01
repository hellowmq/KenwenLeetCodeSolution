package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution258UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution258";
    private Solution258 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution258();
    }

    @Test
    public void testAddDigits_Case1() {
        int n = 38;
        int expected = 2;
        Assert.assertEquals(expected, mTestSolution.addDigits(n));
    }

    @Test
    public void testAddDigits_Case2() {
        int n = 27518;
        int expected = 5;
        Assert.assertEquals(expected, mTestSolution.addDigits(n));
    }
}