package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1779UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1779";

    private Solution1779 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1779();
    }

    @Test
    public void testNearestValidPoint_Case1() {
        int x = 3;
        int y = 4;
        int[][] points = {
                {1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}
        };
        int expected = 2;
        Assert.assertEquals(expected, mTestSolution.nearestValidPoint(x, y, points));
    }

    @Test
    public void testNearestValidPoint_Case2() {
        int x = 3;
        int y = 4;
        int[][] points = {
                {3, 4}
        };
        int expected = 0;
        Assert.assertEquals(expected, mTestSolution.nearestValidPoint(x, y, points));
    }

    @Test
    public void testNearestValidPoint_Case3() {
        int x = 3;
        int y = 4;
        int[][] points = {
                {2, 3}
        };
        int expected = -1;
        Assert.assertEquals(expected, mTestSolution.nearestValidPoint(x, y, points));
    }
}