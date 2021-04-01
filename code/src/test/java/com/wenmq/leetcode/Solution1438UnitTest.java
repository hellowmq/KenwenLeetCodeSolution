package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1438UnitTest {

    private Solution1438 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1438();
    }

    @Test
    public void testLongestSubarray_Case1() {
        int[] nums = new int[]{8, 2, 4, 7};
        int limits = 4;
        int expect = 2;
        int actual = mTestSolution.longestSubarray(nums, limits);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testLongestSubarray_Case2() {
        int[] nums = new int[]{10, 1, 2, 4, 7, 2};
        int limits = 5;
        int expect = 4;
        int actual = mTestSolution.longestSubarray(nums, limits);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testLongestSubarray_Case3() {
        int[] nums = new int[]{4, 2, 2, 2, 4, 4, 2, 2};
        int limits = 0;
        int expect = 3;
        int actual = mTestSolution.longestSubarray(nums, limits);
        Assert.assertEquals(expect, actual);
    }
}