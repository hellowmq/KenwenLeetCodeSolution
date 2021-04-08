package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution201UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution201";
    private Solution201 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution201();
    }

    @Test
    public void testRangeBitwiseAnd_Case1() {
        int left = 5;
        int right = 7;
        int actual = mTestSolution.rangeBitwiseAnd(left, right);
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRangeBitwiseAnd_Case2() {
        int left = 0;
        int right = 0;
        int actual = mTestSolution.rangeBitwiseAnd(left, right);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRangeBitwiseAnd_Case3() {
        int left = 1;
        int right = 2147483647;
        int actual = mTestSolution.rangeBitwiseAnd(left, right);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }
}