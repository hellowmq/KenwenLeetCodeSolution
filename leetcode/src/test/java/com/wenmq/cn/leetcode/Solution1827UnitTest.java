package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1827UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1827";


    private Solution1827 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1827();
    }

    @Test
    public void testMinOperations_Case1() {
        int[] nums = new int[]{
                1, 1, 1
        };
        int expected = 3;
        assertMoreSolution(nums, expected);
    }

    @Test
    public void testMinOperations_Case2() {
        int[] nums = new int[]{
                1, 5, 2, 4, 1
        };
        int expected = 14;
        assertMoreSolution(nums, expected);
    }

    @Test
    public void testMinOperations_Case3() {
        int[] nums = new int[]{
                9
        };
        int expected = 0;
        assertMoreSolution(nums, expected);
    }

    private void assertMoreSolution(int[] nums, int expected) {
        Assert.assertEquals(expected, mTestSolution.minOperations(nums));
        Assert.assertEquals(expected, mTestSolution.minOperations2(nums));
    }
}