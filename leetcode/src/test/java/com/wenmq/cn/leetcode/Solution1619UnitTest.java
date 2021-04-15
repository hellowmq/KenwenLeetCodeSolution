package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1619UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1619";
    public static final double DELTA = 1e-5d;

    private Solution1619 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1619();
    }

    @Test
    public void testTrimMean_Case1() {
        int[] arr = new int[]{
                1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3
        };
        double expected = 2;
        assertMoreSolution(arr, expected);
    }

    @Test
    public void testTrimMean_Case2() {
        int[] arr = new int[]{
                6, 2, 7, 5, 1, 2, 0, 3, 10, 2, 5, 0, 5, 5, 0, 8, 7, 6, 8, 0
        };
        double expected = 4;
        assertMoreSolution(arr, expected);
    }

    @Test
    public void testTrimMean_Case3() {
        int[] arr = new int[]{
                6, 0, 7, 0, 7, 5, 7, 8, 3, 4, 0, 7, 8, 1, 6, 8, 1, 1, 2,
                4, 8, 1, 9, 5, 4, 3, 8, 5, 10, 8, 6, 6, 1, 0, 6, 10, 8, 2, 3, 4
        };
        double expected = 4.77778;
        assertMoreSolution(arr, expected);
    }

    @Test
    public void testTrimMean_Case4() {
        int[] arr = new int[]{
                9, 7, 8, 7, 7, 8, 4, 4, 6, 8, 8, 7, 6, 8, 8, 9, 2, 6, 0, 0, 1, 10,
                8, 6, 3, 3, 5, 1, 10, 9, 0, 7, 10, 0, 10, 4, 1, 10, 6, 9, 3, 6, 0,
                0, 2, 7, 0, 6, 7, 2, 9, 7, 7, 3, 0, 1, 6, 1, 10, 3
        };
        double expected = 5.27778;
        assertMoreSolution(arr, expected);
    }

    @Test
    public void testTrimMean_Case5() {
        int[] arr = new int[]{
                4, 8, 4, 10, 0, 7, 1, 3, 7, 8, 8, 3, 4, 1, 6, 2, 1, 1, 8, 0, 9, 8, 0,
                3, 9, 10, 3, 10, 1, 10, 7, 3, 2, 1, 4, 9, 10, 7, 6, 4, 0, 8, 5, 1, 2,
                1, 6, 2, 5, 0, 7, 10, 9, 10, 3, 7, 10, 5, 8, 5, 7, 6, 7, 6, 10, 9, 5,
                10, 5, 5, 7, 2, 10, 7, 7, 8, 2, 0, 1, 1
        };
        double expected = 5.29167;
        assertMoreSolution(arr, expected);
    }

    private void assertMoreSolution(int[] arr, double expected) {
        Assert.assertEquals(expected, mTestSolution.trimMean(arr), DELTA);
        Assert.assertEquals(expected, mTestSolution.trimMean2(arr), DELTA);
    }
}