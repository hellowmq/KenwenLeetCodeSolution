package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1710UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1710";

    private Solution1710 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1710();
    }

    @Test
    public void testMaximumUnits_Case1() {
        int[][] boxTypes = {{1, 3}, {2, 2}, {3, 1}};
        int truckSize = 4;
        int expected = 8;
        Assert.assertEquals(expected, mTestSolution.maximumUnits(boxTypes, truckSize));
    }

    @Test
    public void testMaximumUnits_Case2() {
        int[][] boxTypes = {{5, 10}, {2, 5}, {4, 7}, {3, 9}};
        int truckSize = 10;
        int expected = 91;
        Assert.assertEquals(expected, mTestSolution.maximumUnits(boxTypes, truckSize));
    }
}