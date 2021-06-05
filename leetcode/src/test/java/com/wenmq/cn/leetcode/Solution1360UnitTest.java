package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1360UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1360";

    private Solution1360 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1360();
    }

    @Test
    public void testToDay_Case1() {
        String date1 = "2019-06-29";
        String date2 = "2019-06-30";
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.daysBetweenDates(date1, date2));
    }

    @Test
    public void testToDay_Case2() {
        String date1 = "2020-01-15";
        String date2 = "2019-12-31";
        int expected = 15;
        Assert.assertEquals(expected, mTestSolution.daysBetweenDates(date1, date2));
    }


}