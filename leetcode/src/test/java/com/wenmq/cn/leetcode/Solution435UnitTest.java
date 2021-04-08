package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution435UnitTest {

    public static final String TAG = "com.wenmq.cn.leetcode.Solution435";
    private Solution435 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution435();
    }

    @Test
    public void testEraseOverlapIntervals_case1() {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.eraseOverlapIntervals(intervals));
        Assert.assertEquals(expected, mTestSolution.eraseOverlapIntervals2(intervals));
    }

    @Test
    public void testEraseOverlapIntervals_case2() {
        int[][] intervals = {{1, 2}, {1, 2}, {1, 2}};
        int expected = 2;
        Assert.assertEquals(expected, mTestSolution.eraseOverlapIntervals(intervals));
        Assert.assertEquals(expected, mTestSolution.eraseOverlapIntervals2(intervals));
    }

    @Test
    public void testEraseOverlapIntervals_case3() {
        int[][] intervals = {{1, 2}, {2, 3}};
        int expected = 0;
        Assert.assertEquals(expected, mTestSolution.eraseOverlapIntervals(intervals));
        Assert.assertEquals(expected, mTestSolution.eraseOverlapIntervals2(intervals));
    }

    @Test
    public void testEraseOverlapIntervals_case4() {
        int[][] intervals = {{1, 4}, {2, 3}};
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.eraseOverlapIntervals(intervals));
        Assert.assertEquals(expected, mTestSolution.eraseOverlapIntervals2(intervals));
    }

    @Test
    public void testEraseOverlapIntervals_case5() {
        int[][] intervals = {{1, 2}};
        int expected = 0;
        Assert.assertEquals(expected, mTestSolution.eraseOverlapIntervals(intervals));
        Assert.assertEquals(expected, mTestSolution.eraseOverlapIntervals2(intervals));
    }
}