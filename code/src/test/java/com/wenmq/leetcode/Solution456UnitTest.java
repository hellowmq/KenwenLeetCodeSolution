package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution456UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution456";
    private Solution456 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution456();
    }

    @Test
    public void testFind132pattern_Case1() {
        int[] array = new int[]{1, 2, 3, 4};
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.find132pattern(array));
        Assert.assertEquals(expected, mTestSolution.find132pattern2(array));
    }

    @Test
    public void testFind132pattern_Case2() {
        int[] array = new int[]{3, 1, 4, 2};
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.find132pattern(array));
        Assert.assertEquals(expected, mTestSolution.find132pattern2(array));
    }

    @Test
    public void testFind132pattern_Case3() {
        int[] array = new int[]{-1, 3, 2, 0};
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.find132pattern(array));
        Assert.assertEquals(expected, mTestSolution.find132pattern2(array));
    }
}