package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution213UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution213";

    private Solution213 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution213();
    }

    @Test
    public void testRob_Case1() {
        int[] nums = {2, 3, 2};
        int expected = 3;
        Assert.assertEquals(expected, mTestSolution.rob(nums));
    }

    @Test
    public void testRob_Case2() {
        int[] nums = {2, 3, 2, 1};
        int expected = 4;
        Assert.assertEquals(expected, mTestSolution.rob(nums));
    }

    @Test
    public void testRob_Case3() {
        int[] nums = {0};
        int expected = 0;
        Assert.assertEquals(expected, mTestSolution.rob(nums));
    }
}