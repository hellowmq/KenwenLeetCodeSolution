package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution162UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution162";

    private Solution162 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution162();
    }

    @Test
    public void testFindPeakElement_Case1() {
        int[] nums = new int[]{1, 2, 3, 1};
        int expected = 2;
        Assert.assertEquals(expected, mTestSolution.findPeakElement(nums));
    }

    @Test
    public void testFindPeakElement_Case2() {
        int[] nums = new int[]{1, 2, 1, 3, 5, 6, 4};
        int expected1 = 1;
        int expected2 = 5;
        int peakElement = mTestSolution.findPeakElement(nums);
        Assert.assertTrue(
                expected1 == peakElement || expected2 == peakElement
        );
    }
}