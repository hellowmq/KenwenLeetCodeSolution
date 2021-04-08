package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution452UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution452";

    private Solution452 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution452();
    }

    @Test
    public void testFindMinArrowShots_Case1() {
        //[10,16],[2,8],[1,6],[7,12]]
        int[][] points0 = {{10, 16}, {2, 8}, {1, 6}, {7, 12}}; // 2
        int expected = 2;
        Assert.assertEquals(expected, mTestSolution.findMinArrowShots(points0));
    }

    @Test
    public void testFindMinArrowShots_Case2() {
        int[][] points1 = {{1, 2}, {3, 4}, {5, 6}, {7, 8}}; // 4
        int expected = 4;
        Assert.assertEquals(expected, mTestSolution.findMinArrowShots(points1));
    }

    @Test
    public void testFindMinArrowShots_Case3() {
        int[][] points2 = {{1, 2}, {2, 3}, {3, 4}, {4, 5}}; //2
        int expected = 2;
        Assert.assertEquals(expected, mTestSolution.findMinArrowShots(points2));
    }

    @Test
    public void testFindMinArrowShots_Case4() {
        int[][] points3 = {{1, 2}}; // 1
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.findMinArrowShots(points3));
    }

    @Test
    public void testFindMinArrowShots_Case5() {
        int[][] points4 = {{2, 3}, {2, 3}}; // 1
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.findMinArrowShots(points4));
    }

    @Test
    public void testFindMinArrowShots_Case6() {
        int[][] errorCase = {{-2147483646, -2147483645}, {2147483646, 2147483647}};
        int expected = 2;
        Assert.assertEquals(expected, mTestSolution.findMinArrowShots(errorCase));
    }


    @Test
    public void testFindMinArrowShots_Case7() {
        int[][] errorCase = {};
        int expected = 0;
        Assert.assertEquals(expected, mTestSolution.findMinArrowShots(errorCase));
    }
}