package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution74UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution74";

    private Solution74 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution74();
    }

    @Test
    public void testSearchMatrix_Case1() {
        int[][] matrix = new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 3;
        boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.searchMatrix(matrix, target));
    }

    @Test
    public void testSearchMatrix_Case2() {
        int[][] matrix = new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 13;
        boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.searchMatrix(matrix, target));
    }

    @Test
    public void testSearchMatrix_Case3() {
        int[][] matrix = new int[][]{};
        int target = 0;
        boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.searchMatrix(matrix, target));
    }
}