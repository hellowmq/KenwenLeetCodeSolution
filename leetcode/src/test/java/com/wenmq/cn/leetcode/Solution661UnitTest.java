package com.wenmq.cn.leetcode;

import com.wenmq.cn.tools.ArrayTools;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution661UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution661";


    private Solution661 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution661();
    }

    @Test
    public void testImageSmoother_Case1() {
        int[][] img = new int[][]{
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1},
        };
        int[][] expected = new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},
        };
        assertMoreSolution(img, expected);
    }

    @Test
    public void testImageSmoother_Case2() {
        int[][] img = new int[][]{
                {100, 200, 100},
                {200, 50, 200},
                {100, 200, 100}
        };
        int[][] expected = new int[][]{
                {137, 141, 137},
                {141, 138, 141},
                {137, 141, 137},
        };
        assertMoreSolution(img, expected);
    }

    private void assertMoreSolution(int[][] img, int[][] expected) {
        Assert.assertArrayEquals(expected, mTestSolution.imageSmoother(
                ArrayTools.copyOfMatrix(img)));
        Assert.assertArrayEquals(expected, mTestSolution.imageSmoother2(
                ArrayTools.copyOfMatrix(img)));
    }
}