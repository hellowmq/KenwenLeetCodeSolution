package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1413UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1413";

    private Solution1413 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1413();
    }

    @Test
    public void testMinStartValue_Case1() {
        int[] nums = new int[]{
                -3, 2, -3, 4, 2
        };
        int expected = 5;
        Assert.assertEquals(expected, mTestSolution.minStartValue(nums));
    }

    @Test
    public void testMinStartValue_Case2() {
        int[] nums = new int[]{
                1, 2
        };
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.minStartValue(nums));
    }

    @Test
    public void testMinStartValue_Case3() {
        int[] nums = new int[]{
                1, -2, -3
        };
        int expected = 5;
        Assert.assertEquals(expected, mTestSolution.minStartValue(nums));
    }
}