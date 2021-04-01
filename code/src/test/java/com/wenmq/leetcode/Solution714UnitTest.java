package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution714UnitTest {

    public static final String TAG = "com.wenmq.leetcode.Solution714";
    private Solution714 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution714();
    }

    @Test
    public void testMaxProfit_case1() {
        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 2;
        int expected = 8;
        Assert.assertEquals(expected, mTestSolution.maxProfit(prices, fee));
    }

    @Test
    public void testMaxProfit_case2() {
        int[] prices = {1, 3, 2, 8, 7, 9};
        int fee = 2;
        int expected = 6;
        Assert.assertEquals(expected, mTestSolution.maxProfit(prices, fee));
    }

    @Test
    public void testMaxProfit_case3() {
        int[] prices = {1};
        int fee = 2;
        int expected = 0;
        Assert.assertEquals(expected, mTestSolution.maxProfit(prices, fee));
    }
}