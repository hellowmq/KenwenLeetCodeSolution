package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1688UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1688";

    private Solution1688 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1688();
    }

    @Test
    public void testNumberOfMatches_Case1() {
        int n = 7;
        int expected = 6;
        Assert.assertEquals(expected, mTestSolution.numberOfMatches(n));
    }

    @Test
    public void testNumberOfMatches_Case2() {
        int n = 14;
        int expected = 13;
        Assert.assertEquals(expected, mTestSolution.numberOfMatches(n));
    }
}