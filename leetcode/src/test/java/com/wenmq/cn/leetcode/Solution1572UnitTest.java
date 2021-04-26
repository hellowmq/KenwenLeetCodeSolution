package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1572UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1572";

    private Solution1572 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1572();
    }

    @Test
    public void testDiagonalSum_Case1() {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int expected = 25;
        Assert.assertEquals(expected, mTestSolution.diagonalSum(mat));
    }

    @Test
    public void testDiagonalSum_Case2() {
        int[][] mat = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
        };
        int expected = 8;
        Assert.assertEquals(expected, mTestSolution.diagonalSum(mat));
    }

    @Test
    public void testDiagonalSum_Case3() {
        int[][] mat = {
                {5},
        };
        int expected = 5;
        Assert.assertEquals(expected, mTestSolution.diagonalSum(mat));
    }


    @Test
    public void testDiagonalSum_Case4() {
        int[][] mat = {
                {7, 3, 1, 9},
                {3, 4, 6, 9},
                {6, 9, 6, 6},
                {9, 5, 8, 5},
        };
        int expected = 55;
        Assert.assertEquals(expected, mTestSolution.diagonalSum(mat));
    }
}