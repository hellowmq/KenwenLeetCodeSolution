package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution766UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution766";
    private Solution766 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution766();
    }

    @Test
    public void testIsToeplitzMatrix_Case1() {
        int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
        final boolean expect = true;
        boolean actual = mTestSolution.isToeplitzMatrix(matrix);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testIsToeplitzMatrix_Case2() {
        int[][] matrix = new int[][]{{1, 2}, {2, 2}};
        final boolean expect = false;
        boolean actual = mTestSolution.isToeplitzMatrix(matrix);
        Assert.assertEquals(expect, actual);
    }
}