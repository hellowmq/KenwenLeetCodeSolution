package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution188UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution188";
    private Solution188 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution188();
    }

    @Test
    public void testMaxProfit_Case1() {
        int k = 2;
        int[] prices = new int[]{2, 4, 1};
        int expected = 2;
        Assert.assertEquals(expected, mTestSolution.maxProfit(k, prices));
    }
    @Test
    public void testMaxProfit_Case2() {
        int k = 2;
        int[] prices = new int[]{3,2,6,5,0,3};
        int expected = 7;
        Assert.assertEquals(expected, mTestSolution.maxProfit(k, prices));
    }

    @Test
    public void testMaxProfit_Case3() {
        int k = 1;
        int[] prices = new int[]{3};
        int expected = 0;
        Assert.assertEquals(expected, mTestSolution.maxProfit(k, prices));
    }
}