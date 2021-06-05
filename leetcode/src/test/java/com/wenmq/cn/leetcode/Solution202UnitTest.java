package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution202UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution202";
    private Solution202 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution202();
    }

    @Test
    public void testIsHappy_Case1() {
        int n = 19;
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.isHappy(n));
    }

    @Test
    public void testIsHappy_Case2() {
        int n = 2;
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.isHappy(n));
    }
}