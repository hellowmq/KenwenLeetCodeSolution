package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1748UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1748";

    private Solution1748 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1748();
    }

    @Test
    public void testSumOfUnique_Case1() {
        int[] nums = new int[]{1, 2, 3, 2};
        int expected = 4;
        assertMoreSolution(nums, expected);
    }


    @Test
    public void testSumOfUnique_Case2() {
        int[] nums = new int[]{1, 1, 1, 1, 1};
        int expected = 0;
        assertMoreSolution(nums, expected);
    }

    @Test
    public void testSumOfUnique_Case3() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int expected = 15;
        assertMoreSolution(nums, expected);
    }

    private void assertMoreSolution(int[] nums, int expected) {
        Assert.assertEquals(expected, mTestSolution.sumOfUnique(nums));
        Assert.assertEquals(expected, mTestSolution.sumOfUnique2(nums));
    }
}