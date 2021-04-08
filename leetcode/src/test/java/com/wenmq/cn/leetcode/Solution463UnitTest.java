package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution463UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution463";
    private Solution463 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution463();
    }

    @Test
    public void testIslandPerimeter_Case1() {
        int[][] grid = new int[][]{
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0},
        };
        final int expect = 16;
        int actual = mTestSolution.islandPerimeter(grid);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testIslandPerimeter_Case2() {
        int[][] grid = new int[][]{{1}};
        final int expect = 4;
        int actual = mTestSolution.islandPerimeter(grid);
        Assert.assertEquals(expect, actual);
    }
}