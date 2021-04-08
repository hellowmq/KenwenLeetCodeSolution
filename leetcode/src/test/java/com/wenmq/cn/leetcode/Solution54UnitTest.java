package com.wenmq.cn.leetcode;

import com.wenmq.tools.ArrayTools;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution54UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution54";
    private Solution54 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution54();
    }

    @Test
    public void testSpiralOrder_Case1() {
        int[][] mesh = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        String actual = mTestSolution.spiralOrder(mesh).toString();
        Object[] list = {
                1, 2, 3, 6, 9, 8, 7, 4, 5
        };
        String expected = ArrayTools.array2ListString(list);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpiralOrder_Case2() {
        int[][] mesh = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };

        String actual = mTestSolution.spiralOrder(mesh).toString();
        Object[] list = {
                1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7
        };
        String expected = ArrayTools.array2ListString(list);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpiralOrder_Case3() {
        int[][] mesh = new int[][]{
                {},
                {},
                {},
        };

        String actual = mTestSolution.spiralOrder(mesh).toString();
        Object[] list = {};
        String expected = ArrayTools.array2ListString(list);
        Assert.assertEquals(expected, actual);
    }
}