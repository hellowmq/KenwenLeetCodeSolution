package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution461UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution461";


    private Solution461 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution461();
    }

    @Test
    public void testHammingDistance_Case1() {
        int x = 1;
        int y = 4;
        int expected = 2;
        int actual = mTestSolution.hammingDistance(x, y);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHammingDistance_Case2() {
        int x = 3;
        int y = 1;
        int expected = 1;
        int actual = mTestSolution.hammingDistance(x, y);
        Assert.assertEquals(expected, actual);
    }
}