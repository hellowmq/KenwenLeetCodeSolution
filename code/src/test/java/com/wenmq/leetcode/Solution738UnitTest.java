package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution738UnitTest {

    public static final String TAG = "com.wenmq.leetcode.Solution738";
    private Solution738 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution738();
    }

    @Test
    public void testMonotoneIncreasingDigits_case1() {
        int expected = 9;
        int n = 10;
        Assert.assertEquals(expected, mTestSolution.monotoneIncreasingDigits(n));
        Assert.assertEquals(expected, mTestSolution.monotoneIncreasingDigits2(n));
    }

    @Test
    public void testMonotoneIncreasingDigits_case2() {
        int expected = 1234;
        int n = 1234;
        Assert.assertEquals(expected, mTestSolution.monotoneIncreasingDigits(n));
        Assert.assertEquals(expected, mTestSolution.monotoneIncreasingDigits2(n));
    }

    @Test
    public void testMonotoneIncreasingDigits_case3() {
        int expected = 299;
        int n = 332;
        Assert.assertEquals(expected, mTestSolution.monotoneIncreasingDigits(n));
        Assert.assertEquals(expected, mTestSolution.monotoneIncreasingDigits2(n));
    }
}