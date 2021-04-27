package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1523UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1523";

    private Solution1523 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1523();
    }

    @Test
    public void testCountOdds_Case1() {
        int low = 3;
        int high = 7;
        int expected = 3;
        Assert.assertEquals(expected, mTestSolution.countOdds(low, high));
    }

    @Test
    public void testCountOdds_Case2() {
        int low = 8;
        int high = 10;
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.countOdds(low, high));
    }
}