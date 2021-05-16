package com.wenmq.cn.leetcode;

import com.wenmq.cn.tools.ArrayTools;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1260UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1260";

    private Solution1260 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1260();
    }

    @Test
    public void testShiftGrid_Case1() {
        int[][] grid = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int k = 1;
        int[][] expected = new int[][]{
                {9, 1, 2},
                {3, 4, 5},
                {6, 7, 8}
        };
        assertMoreSolution(grid, k, expected);
    }

    @Test
    public void testShiftGrid_Case2() {
        int[][] grid = new int[][]{
                {3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}, {12, 0, 21, 13}

        };
        int k = 4;
        int[][] expected = new int[][]{
                {12, 0, 21, 13}, {3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}
        };
        assertMoreSolution(grid, k, expected);

    }

    @Test
    public void testShiftGrid_Case3() {
        int[][] grid = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int k = 9;
        int[][] expected = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertMoreSolution(grid, k, expected);

    }

    @Test
    public void testShiftGrid_CaseEmpty() {
        int[][] grid = new int[][]{
        };
        int k = 9;
        int[][] expected = new int[][]{
        };
        assertMoreSolution(grid, k, expected);

    }

    private void assertMoreSolution(int[][] grid, int k, int[][] expected) {
        Assert.assertEquals(ArrayTools.array2ListString(expected), mTestSolution.shiftGrid2(grid, k).toString());
        mTestSolution.shiftGrid(grid, k);
        Assert.assertEquals(ArrayTools.array2ListString(expected), ArrayTools.array2ListString(grid));
    }

}