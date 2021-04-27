package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1588UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1588";

    private Solution1588 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1588();
    }

    @Test
    public void testSumOddLengthSubarrays_Case1() {
        int[] arr = new int[]{
                1, 4, 2, 5, 3
        };
        int expected = 58;
        Assert.assertEquals(expected, mTestSolution.sumOddLengthSubarrays(arr));
    }

    @Test
    public void testSumOddLengthSubarrays_Case2() {
        int[] arr = new int[]{
                1, 2
        };
        int expected = 3;
        Assert.assertEquals(expected, mTestSolution.sumOddLengthSubarrays(arr));
    }

    @Test
    public void testSumOddLengthSubarrays_Case3() {
        int[] arr = new int[]{
                10, 11, 12
        };
        int expected = 66;
        Assert.assertEquals(expected, mTestSolution.sumOddLengthSubarrays(arr));
    }
}