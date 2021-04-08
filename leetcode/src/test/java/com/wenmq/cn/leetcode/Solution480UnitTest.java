package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution480UnitTest {

    public static final String TAG = "com.wenmq.cn.leetcode.Solution480";
    private Solution480 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution480();
    }

    @Test
    public void testMedianSlidingWindow_Case1() {
        int[] array = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        double[] expect = new double[]{1, -1, -1, 3, 5, 6};
        double[] results = mTestSolution.medianSlidingWindow(array, k);
        Assert.assertArrayEquals(expect, results, 0.1);
    }

    @Test
    public void testMedianSlidingWindow_Case2() {
        int[] array = new int[]{1};
        int k = 1;
        double[] expect = new double[]{1};
        double[] results = mTestSolution.medianSlidingWindow(array, k);
        Assert.assertArrayEquals(expect, results, 0.1);
    }

    @Test
    public void testMedianSlidingWindow_Case3() {
        int[] array = new int[]{};
        int k = 1;
        double[] expect = new double[]{};
        double[] results = mTestSolution.medianSlidingWindow(array, k);
        Assert.assertArrayEquals(expect, results, 0.1);
    }
}