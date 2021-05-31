package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1518UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1518";

    private Solution1518 mTestSolution;

    @Before
    public void setUp() {
        mTestSolution = new Solution1518();
    }

    @Test
    public void testNumWaterBottles_Case1() {
        int numBottles = 9;
        int numExchange = 3;
        int expected = 13;
        Assert.assertEquals(expected, mTestSolution.numWaterBottles(numBottles, numExchange));
    }

    @Test
    public void testNumWaterBottles_Case2() {
        int numBottles = 15;
        int numExchange = 4;
        int expected = 19;
        Assert.assertEquals(expected, mTestSolution.numWaterBottles(numBottles, numExchange));
    }

    @Test
    public void testNumWaterBottles_Case3() {
        int numBottles = 5;
        int numExchange = 5;
        int expected = 6;
        Assert.assertEquals(expected, mTestSolution.numWaterBottles(numBottles, numExchange));
    }

    @Test
    public void testNumWaterBottles_Case4() {
        int numBottles = 2;
        int numExchange = 3;
        int expected = 2;
        Assert.assertEquals(expected, mTestSolution.numWaterBottles(numBottles, numExchange));
    }

    @Test
    public void testNumWaterBottles_Case5() {
        int numBottles = 15;
        int numExchange = 4;
        int expected = 19;
        Assert.assertEquals(expected, mTestSolution.numWaterBottles(numBottles, numExchange));
    }

}