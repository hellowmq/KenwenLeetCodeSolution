package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1006UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1006";

    private Solution1006 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1006();
    }

    @Test
    public void testClumsy_Case1() {
        int n = 4;
        int expected = 7;
        Assert.assertEquals(expected, mTestSolution.clumsy(n));
    }

    @Test
    public void testClumsy_Case2() {
        int n = 10;
        int expected = 12;
        Assert.assertEquals(expected, mTestSolution.clumsy(n));
    }

    @Test
    public void testClumsy_CaseList() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] expected = new int[]{1, 2, 6, 7, 7, 8, 6, 9};
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = mTestSolution.clumsy(input[i]);
        }
        Assert.assertArrayEquals(expected, output);
    }
}