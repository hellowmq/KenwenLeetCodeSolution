package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1752UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1752";

    private Solution1752 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1752();
    }

    @Test
    public void testCheck_Case1() {
        int[] nums = new int[]{3, 4, 5, 1, 2};
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.check(nums));
    }

    @Test
    public void testCheck_Case2() {
        int[] nums = new int[]{2, 1, 3, 4};
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.check(nums));
    }


    @Test
    public void testCheck_Case3() {
        int[] nums = new int[]{1, 2, 3};
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.check(nums));
    }

    @Test
    public void testCheck_Case4() {
        int[] nums = new int[]{1, 1, 1};
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.check(nums));
    }

    @Test
    public void testCheck_Case5() {
        int[] nums = new int[]{2, 1};
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.check(nums));
    }


}