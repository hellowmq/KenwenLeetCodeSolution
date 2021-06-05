package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1252UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1252";

    private Solution1252 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1252();
    }

    @Test
    public void testOddCells_Case1() {
        int m = 2;
        int n = 3;
        int[][] indices = new int[][]{
                {0, 1}, {1, 1}
        };
        int expected = 6;
        Assert.assertEquals(expected, mTestSolution.oddCells(m, n, indices));
    }

    @Test
    public void testOddCells_Case2() {
        int m = 2;
        int n = 2;
        int[][] indices = new int[][]{
                {1, 1}, {0, 0}
        };
        int expected = 0;
        Assert.assertEquals(expected, mTestSolution.oddCells(m, n, indices));
    }

    @Test
    public void testOddCells_Case3() {
        int m = 48;
        int n = 37;
        int[][] indices = new int[][]{
                {40, 5},
        };
        int expected = 83;
        Assert.assertEquals(expected, mTestSolution.oddCells(m, n, indices));
    }
}