package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution163UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution163";

    private Solution163 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution163();
    }

    @Test
    public void testIsUgly_Case1() {
        int num = 6;
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.isUgly(num));
    }

    @Test
    public void testIsUgly_Case2() {
        int num = 8;
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.isUgly(num));
    }

    @Test
    public void testIsUgly_Case3() {
        int num = 14;
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.isUgly(num));
    }

    @Test
    public void testIsUgly_Case4() {
        int num = 1;
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.isUgly(num));
    }

    @Test
    public void testIsUgly_Case5() {
        int num = 30;
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.isUgly(num));
    }

}