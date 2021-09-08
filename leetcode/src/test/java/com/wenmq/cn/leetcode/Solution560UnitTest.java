package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution560UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution560";


    private Solution560 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution560();
    }

    @Test
    public void testSubarraySum_Case1() {
        int[] nums = new int[]{
                1, 1, 1
        };
        int k = 2;
        int expected = 2;
        assertMoreSolution(nums, k, expected);
    }

    @Test
    public void testSubarraySum_Case2() {
        int[] nums = new int[]{
                1
        };
        int k = 1;
        int expected = 1;
        assertMoreSolution(nums, k, expected);
    }

    private void assertMoreSolution(int[] nums, int k, int expected) {
        Assert.assertEquals(expected, mTestSolution.subarraySum(nums, k));
        Assert.assertEquals(expected, mTestSolution.subarraySum2(nums, k));
        Assert.assertEquals(expected, mTestSolution.subarraySum3(nums, k));
    }
}