package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1470UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1470";

    private Solution1470 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1470();
    }

    @Test
    public void testShuffle_Case1() {
        int[] nums = {
                2, 5, 1, 3, 4, 7
        };
        int n = 3;
        int[] expected = {
                2, 3, 5, 4, 1, 7
        };
        Assert.assertArrayEquals(expected, mTestSolution.shuffle(nums, n));
    }

    @Test
    public void testShuffle_Case2() {
        int[] nums = {
                1, 2, 3, 4, 4, 3, 2, 1
        };
        int n = 4;
        int[] expected = {
                1, 4, 2, 3, 3, 2, 4, 1
        };
        Assert.assertArrayEquals(expected, mTestSolution.shuffle(nums, n));
    }

    @Test
    public void testShuffle_Case3() {
        int[] nums = {
                1, 1, 2, 2
        };
        int n = 2;
        int[] expected = {
                1, 2, 1, 2
        };
        Assert.assertArrayEquals(expected, mTestSolution.shuffle(nums, n));
    }
}