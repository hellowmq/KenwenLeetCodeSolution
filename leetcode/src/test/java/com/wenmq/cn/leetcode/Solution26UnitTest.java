package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class Solution26UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution26";

    private Solution26 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution26();
    }

    @Test
    public void testRemoveDuplicates_Case1() {
        int[] nums = {1, 1, 2};
        int len = mTestSolution.removeDuplicates(nums);

        int[] expected = {1, 2};
        int expectedLen = 2;
        Assert.assertEquals(expectedLen, len);
        Assert.assertArrayEquals(expected, Arrays.copyOf(nums, len));
    }

    @Test
    public void testRemoveDuplicates_Case2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len = mTestSolution.removeDuplicates(nums);

        int[] expected = {0, 1, 2, 3, 4,};
        int expectedLen = 5;
        Assert.assertEquals(expectedLen, len);
        Assert.assertArrayEquals(expected, Arrays.copyOf(nums, len));
    }

    @Test
    public void testRemoveDuplicates_Case3() {
        int[] nums = {};
        int len = mTestSolution.removeDuplicates(nums);

        int[] expected = {};
        int expectedLen = 0;
        Assert.assertEquals(expectedLen, len);
        Assert.assertArrayEquals(expected, Arrays.copyOf(nums, len));
    }
}