package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1736UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1736";

    private Solution1736 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1736();
    }

    @Test
    public void testMaximumTime_Case1() {
        String time = "2?:?0";
        String expected = "23:50";
        Assert.assertEquals(expected, mTestSolution.maximumTime(time));
    }

    @Test
    public void testMaximumTime_Case2() {
        String time = "0?:3?";
        String expected = "09:39";
        Assert.assertEquals(expected, mTestSolution.maximumTime(time));
    }

    @Test
    public void testMaximumTime_Case3() {
        String time = "1?:22";
        String expected = "19:22";
        Assert.assertEquals(expected, mTestSolution.maximumTime(time));
    }

    @Test
    public void testMaximumTime_Case4() {
        String time = "??:45";
        String expected = "23:45";
        Assert.assertEquals(expected, mTestSolution.maximumTime(time));
    }
}