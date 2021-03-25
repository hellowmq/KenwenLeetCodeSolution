package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution304UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution304";

    @Test
    public void test2DNumArray() {
        int[][] twoDArray = new int[][]{
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };
        Solution304.Solution numMatrix = new Solution304.NumMatrix(twoDArray);
        Assert.assertEquals(8, numMatrix.sumRegion(2, 1, 4, 3));
        Assert.assertEquals(11, numMatrix.sumRegion(1, 1, 2, 2));
        Assert.assertEquals(12, numMatrix.sumRegion(1, 2, 2, 4));
    }

    @Test
    public void test2DNumArray2() {
        int[][] twoDArray = new int[][]{
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };
        Solution304.Solution numMatrix = new Solution304.NumMatrix2(twoDArray);
        Assert.assertEquals(8, numMatrix.sumRegion(2, 1, 4, 3));
        Assert.assertEquals(11, numMatrix.sumRegion(1, 1, 2, 2));
        Assert.assertEquals(12, numMatrix.sumRegion(1, 2, 2, 4));
    }


    @Test
    public void test2DNumArray_Null() {
        int[][] twoDArray = new int[][]{
        };
        Solution304.NumMatrix numMatrix = new Solution304.NumMatrix(twoDArray);
    }


}