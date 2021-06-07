package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution594UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution594";

    private Solution594 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution594();
    }

    @Test
    public void testFindLHS_Case1() {
        int[] nums = new int[]{
                1, 3, 2, 2, 5, 2, 3, 7
        };
        int expected = 5;
        assertMoreSolution(nums, expected);
    }

    @Test
    public void testFindLHS_Case2() {
        int[] nums = new int[]{
                1, 2, 3, 4
        };
        int expected = 2;
        assertMoreSolution(nums, expected);
    }

    @Test
    public void testFindLHS_Case3() {
        int[] nums = new int[]{
                1, 1, 1, 1
        };
        int expected = 0;
        assertMoreSolution(nums, expected);
    }

    private void assertMoreSolution(int[] nums, int expected) {
        Assert.assertEquals(expected, mTestSolution.findLHS(nums));
        Assert.assertEquals(expected, mTestSolution.findLHS2(nums));
    }
}