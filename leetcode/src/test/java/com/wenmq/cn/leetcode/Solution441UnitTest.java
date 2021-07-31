package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution441UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution441";


    private Solution441 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution441();
    }

    @Test
    public void testArrangeCoins_Case1() {
        int n = 5;
        int expected = 2;
        assertMoreSolution(n, expected);
    }

    @Test
    public void testArrangeCoins_Case2() {
        int n = 8;
        int expected = 3;
        assertMoreSolution(n, expected);
    }

    private void assertMoreSolution(int n, int expected) {
        Assert.assertEquals(expected, mTestSolution.arrangeCoins(n));
        Assert.assertEquals(expected, mTestSolution.arrangeCoins2(n));
    }
}