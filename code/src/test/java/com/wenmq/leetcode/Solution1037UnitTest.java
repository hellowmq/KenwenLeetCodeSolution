package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1037UnitTest {

    private static final String TAG = "Solution1037";

    private Solution1037 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1037();
    }

    @Test
    public void testIsBoomerang_case1() {
        int[][] points = new int[][]{
                {1, 1},
                {2, 3},
                {3, 2},
        };
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.isBoomerang(points));
    }

    @Test
    public void testIsBoomerang_case2() {
        int[][] points = new int[][]{
                {1, 1},
                {2, 2},
                {3, 3},
        };
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.isBoomerang(points));
    }
}