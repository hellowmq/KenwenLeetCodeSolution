package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution495UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution495";


    private Solution495 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution495();
    }

    @Test
    public void testFindPoisonedDuration_Case1() {
        int[] timeSeries = new int[]{
                1, 4
        };
        int duration = 2;
        int expected = 4;
        getAssertEquals(timeSeries, duration, expected);
    }

    @Test
    public void testFindPoisonedDuration_Case2() {
        int[] timeSeries = new int[]{
                1, 2
        };
        int duration = 2;
        int expected = 3;
        getAssertEquals(timeSeries, duration, expected);
    }

    @Test
    public void testFindPoisonedDuration_Case3() {
        int[] timeSeries = new int[]{

        };
        int duration = 2;
        int expected = 0;
        getAssertEquals(timeSeries, duration, expected);
    }

    private void getAssertEquals(int[] timeSeries, int duration, int expected) {
        Assert.assertEquals(expected, mTestSolution.findPoisonedDuration(timeSeries, duration));
        Assert.assertEquals(expected, mTestSolution.findPoisonedDuration2(timeSeries, duration));
    }
}