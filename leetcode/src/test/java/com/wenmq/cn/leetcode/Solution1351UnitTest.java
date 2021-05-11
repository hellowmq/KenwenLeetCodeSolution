package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1351UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1351";

    private Solution1351 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1351();
    }

    @Test
    public void testCountNegatives_Case1() {
        int[][] grid = {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        };
        int expected = 8;
        Assert.assertEquals(expected, mTestSolution.countNegatives(grid));
    }

    @Test
    public void testCountNegatives_Case2() {
        int[][] grid = {
                {3, 2,},
                {1, 0},
        };
        int expected = 0;
        Assert.assertEquals(expected, mTestSolution.countNegatives(grid));
    }

    @Test
    public void testCountNegatives_Case3() {
        int[][] grid = {
                {1, -1},
                {-1, -1},
        };
        int expected = 3;
        Assert.assertEquals(expected, mTestSolution.countNegatives(grid));
    }

    @Test
    public void testCountNegatives_Case4() {
        int[][] grid = {
                {-1},
        };
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.countNegatives(grid));
    }
}