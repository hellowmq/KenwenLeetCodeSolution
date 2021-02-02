package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution480UnitTest {

    String TAG = "com.wenmq.leetcode.Solution480";
    private Solution480 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution480();
    }

    @Test
    public void testMedianSlidingWindow_Case1() {
        int[] array = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        double[] expect = new double[]{1, -1, -1, 3, 5, 6};
        double[] results = mTestSolution.medianSlidingWindow(array, 3);
        Assert.assertArrayEquals(expect, results, 0.1);
    }
}