package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1475UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1475";

    private Solution1475 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1475();
    }

    @Test
    public void testFinalPrices_Case1() {
        int[] prices = {
                8, 4, 6, 2, 3
        };
        int[] expect = {
                4, 2, 4, 2, 3
        };
        Assert.assertEquals(expect, mTestSolution.finalPrices(prices));
    }

    @Test
    public void testFinalPrices_Case2() {
        int[] prices = {
                1, 2, 3, 4, 5
        };
        int[] expect = {
                1, 2, 3, 4, 5
        };
        Assert.assertEquals(expect, mTestSolution.finalPrices(prices));
    }

    @Test
    public void testFinalPrices_Case3() {
        int[] prices = {
                10,1,1,6
        };
        int[] expect = {
                9,0,1,6
        };
        Assert.assertEquals(expect, mTestSolution.finalPrices(prices));
    }
}