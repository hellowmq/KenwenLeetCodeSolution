package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution852UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution852";
    private Solution852 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution852();
    }

    @Test
    public void testPeakIndexInMountainArray_Case1() {
        int[] arr = new int[]{
                0, 1, 0
        };
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.peakIndexInMountainArray(arr));
    }

    @Test
    public void testPeakIndexInMountainArray_Case2() {
        int[] arr = new int[]{
                0, 2, 1, 0
        };
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.peakIndexInMountainArray(arr));
    }

    @Test
    public void testPeakIndexInMountainArray_Case3() {
        int[] arr = new int[]{
                0, 10, 5, 2
        };
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.peakIndexInMountainArray(arr));
    }


    @Test
    public void testPeakIndexInMountainArray_Case4() {
        int[] arr = new int[]{
                3, 4, 5, 1
        };
        int expected = 2;
        Assert.assertEquals(expected, mTestSolution.peakIndexInMountainArray(arr));
    }

    @Test
    public void testPeakIndexInMountainArray_Case5() {
        int[] arr = new int[]{
                24, 69, 100, 99, 79, 78, 67, 36, 26, 19
        };
        int expected = 2;
        Assert.assertEquals(expected, mTestSolution.peakIndexInMountainArray(arr));
    }


}