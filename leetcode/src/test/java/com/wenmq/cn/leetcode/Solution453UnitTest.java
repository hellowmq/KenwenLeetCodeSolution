package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution453UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution453";


    private Solution453 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution453();
    }

    @Test
    public void testMinMoves_Case1() {
        int[] nums = new int[]{
                1, 2, 3
        };
        int expected = 3;
        assertMoreSolution(nums, expected);
    }

    @Test
    public void testMinMoves_Case2() {
        int[] nums = new int[100];
        nums[0] = 2;
        int expected = 2;
        assertMoreSolution(nums, expected);
    }

    private void assertMoreSolution(int[] nums, int expected) {
        Assert.assertEquals(expected, mTestSolution.minMoves(nums));
        Assert.assertEquals(expected, mTestSolution.minMoves2(nums));
    }
}