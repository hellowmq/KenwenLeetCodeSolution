package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1051UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1051";


    private Solution1051 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1051();
    }

    @Test
    public void testHeightChecker_Case1() {
        int[] heights = new int[]{
                1, 1, 4, 2, 1, 3
        };
        int expected = 3;
        assertMoreSolution(heights, expected);
    }

    @Test
    public void testHeightChecker_Case2() {
        int[] heights = new int[]{
                5, 1, 2, 3, 4
        };
        int expected = 5;
        assertMoreSolution(heights, expected);
    }

    @Test
    public void testHeightChecker_Case3() {
        int[] heights = new int[]{
                1, 2, 3, 4, 5
        };
        int expected = 0;
        assertMoreSolution(heights, expected);
    }

    @Test
    public void testHeightChecker_Case4() {
        int[] heights = new int[]{
                31, 81, 41, 78, 48,
                2, 83, 48, 21, 20,
                43, 15, 26, 78, 96,
                55, 5, 46, 35, 89,
                85, 54, 76, 64, 71,
                36, 98, 94, 100, 7,
                88, 92, 80, 43, 24,
                89, 50, 61, 59, 20,
                94, 57, 99, 62, 82,
                46, 28, 57, 66, 62,
                56, 15, 12, 63, 19,
                35, 12, 26, 15, 59,
                8, 44, 46, 45, 33,
                20, 27, 31, 85, 15,
                92, 63, 63, 40, 35,
                95, 91, 1, 4, 57,
                55, 68, 53, 28, 15,
                94, 74, 89, 77, 7,
                25, 63, 77, 24, 76,
                44
        };
        int expected = 0;
        assertMoreSolution(heights, expected);
    }

    private void assertMoreSolution(int[] heights, int expected) {
        Assert.assertEquals(expected, mTestSolution.heightChecker(heights));
        Assert.assertEquals(expected, mTestSolution.heightChecker2(heights));
    }
}