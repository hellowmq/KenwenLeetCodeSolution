package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1323UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1323";

    private Solution1323 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1323();
    }

    @Test
    public void testMaximum69Number_Case1() {
        int num = 9669;
        int expected = 9969;
        Assert.assertEquals(expected, mTestSolution.maximum69Number(num));
    }

    @Test
    public void testMaximum69Number_Case2() {
        int num = 9996;
        int expected = 9999;
        Assert.assertEquals(expected, mTestSolution.maximum69Number(num));
    }

    @Test
    public void testMaximum69Number_Case3() {
        int num = 9999;
        int expected = 9999;
        Assert.assertEquals(expected, mTestSolution.maximum69Number(num));
    }
}