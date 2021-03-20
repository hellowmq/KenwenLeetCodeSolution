package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution73UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution73";
    private Solution73 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution73();
    }

    @Test
    public void testSetZeroes_Case1() {
        int[][] matrix = new int[][]{
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1},
        };
        mTestSolution.setZeroes(matrix);
        int[][] expected = new int[][]{
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1},
        };
        Assert.assertArrayEquals(expected, matrix);
    }

    @Test
    public void testSetZeroes_Case2() {
        int[][] matrix = new int[][]{
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5},
        };
        mTestSolution.setZeroes(matrix);
        int[][] expected = new int[][]{
                {0, 0, 0, 0},
                {0, 4, 5, 0},
                {0, 3, 1, 0},
        };
        Assert.assertArrayEquals(expected, matrix);
    }

}