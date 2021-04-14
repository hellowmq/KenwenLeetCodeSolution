package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1725UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1725";

    private Solution1725 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1725();
    }

    @Test
    public void testCountGoodRectangles_Case1() {
        int[][] rectangles = {
                {5, 8}, {3, 9}, {5, 12}, {19, 5},
        };
        int expected = 3;
        Assert.assertEquals(expected, mTestSolution.countGoodRectangles(rectangles));
    }

    @Test
    public void testCountGoodRectangles_Case2() {
        int[][] rectangles = {
                {2, 3}, {3, 7}, {4, 3}, {3, 7},
        };
        int expected = 3;
        Assert.assertEquals(expected, mTestSolution.countGoodRectangles(rectangles));
    }
}