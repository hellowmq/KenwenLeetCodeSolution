package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("SpellCheckingInspection")
public class Solution930UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution930";


    private Solution930 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution930();
    }

    @Test
    public void testNumSubarraysWithSum_Case1() {
        int[] nums = new int[]{
                1, 0, 1, 0, 1
        };
        int goal = 2;
        int expected = 4;
        assertMoreSolution(nums, goal, expected);
    }

    @Test
    public void testNumSubarraysWithSum_Case2() {
        int[] nums = new int[]{
                0, 0, 0, 0, 0
        };
        int goal = 0;
        int expected = 15;
        assertMoreSolution(nums, goal, expected);
    }

    @Test
    public void testNumSubarraysWithSum_Case3() {
        int[] nums = new int[]{
                0, 0, 0, 0, 0, 0, 1, 0, 0, 0
        };
        int goal = 0;
        int expected = 27;
        assertMoreSolution(nums, goal, expected);
    }

    private void assertMoreSolution(int[] nums, int goal, int expected) {
        Assert.assertEquals(expected, mTestSolution.numSubarraysWithSum(nums, goal));
        Assert.assertEquals(expected, mTestSolution.numSubarraysWithSum2(nums, goal));
        Assert.assertEquals(expected, mTestSolution.numSubarraysWithSum3(nums, goal));
    }
}