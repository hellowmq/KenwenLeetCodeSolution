package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution34UnitTest {

    public static final String TAG = "com.wenmq.leetcode.Solution34";

    Solution34 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution34();
    }

    @Test
    public void testSearchRange_case1() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = {3, 4};
        Assert.assertArrayEquals(result, mTestSolution.searchRange(nums, target));
    }

    @Test
    public void testSearchRange_case2() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] result = {-1, -1};
        Assert.assertArrayEquals(result, mTestSolution.searchRange(nums, target));
    }

    @Test
    public void testSearchRange_case3() {
        int[] nums = {};
        int target = 0;
        int[] result = {-1, -1};
        Assert.assertArrayEquals(result, mTestSolution.searchRange(nums, target));
    }

}