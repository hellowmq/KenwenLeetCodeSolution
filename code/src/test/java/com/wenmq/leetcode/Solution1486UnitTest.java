package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1486UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution1486";

    private Solution1486 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1486();
    }

    @Test
    public void testXorOperation_Case1() {
        int n = 5;
        int start = 0;
        int expected = 8;
        Assert.assertEquals(expected, mTestSolution.xorOperation(n, start));
    }

    @Test
    public void testXorOperation_Case2() {
        int n = 4;
        int start = 3;
        int expected = 8;
        Assert.assertEquals(expected, mTestSolution.xorOperation(n, start));
    }

    @Test
    public void testXorOperation_Case3() {
        int n = 1;
        int start = 7;
        int expected = 7;
        Assert.assertEquals(expected, mTestSolution.xorOperation(n, start));
    }

    @Test
    public void testXorOperation_Case4() {
        int n = 10;
        int start = 5;
        Assert.assertEquals(2, mTestSolution.xorOperation(n, start));
    }

    @Test
    public void testGetXorResult_Case() {
        int k = -1;
        Assert.assertEquals(0, mTestSolution.getXorResult(k));
    }
}