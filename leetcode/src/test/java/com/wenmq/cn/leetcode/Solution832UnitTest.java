package com.wenmq.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

public class Solution832UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution832";
    private Solution832 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution832();
    }

    @Test
    public void testFlipAndInvertImage_Case1_1() {
        int[][] matrix = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] expect = {{1, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] actual = mTestSolution.flipAndInvertImage(matrix);
        Asserts.assert2dArrayEqual(expect, actual);
    }

    @Test
    public void testFlipAndInvertImage_Case1_2() {
        int[][] matrix = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int[][] expect = {{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}};
        int[][] actual = mTestSolution.flipAndInvertImage(matrix);
        Asserts.assert2dArrayEqual(expect, actual);
    }

    @Test
    public void testFlipAndInvertImage_Case2_1() {
        int[][] matrix = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] expect = {{1, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] actual = mTestSolution.flipAndInvertImage2(matrix);
        Asserts.assert2dArrayEqual(expect, actual);
    }

    @Test
    public void testFlipAndInvertImage_Case2_2() {
        int[][] matrix = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int[][] expect = {{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}};
        int[][] actual = mTestSolution.flipAndInvertImage2(matrix);
        Asserts.assert2dArrayEqual(expect, actual);
    }

}