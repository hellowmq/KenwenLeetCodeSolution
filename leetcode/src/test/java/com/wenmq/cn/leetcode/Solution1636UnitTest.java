package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1636UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1636";

    private Solution1636 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1636();
    }

    @Test
    public void testFrequencySort_Case1() {
        int[] nums = {1, 1, 2, 2, 2, 3};
        int[] expected = {3, 1, 1, 2, 2, 2};
        Assert.assertArrayEquals(expected, mTestSolution.frequencySort(nums));
    }

    @Test
    public void testFrequencySort_Case2() {
        int[] nums = {-1, 1, -6, 4, 5, -6, 1, 4, 1};
        int[] expected = {5, -1, 4, 4, -6, -6, 1, 1, 1};
        Assert.assertArrayEquals(expected, mTestSolution.frequencySort(nums));
    }
}