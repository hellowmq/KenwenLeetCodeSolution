package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution134UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution134";
    private Solution134 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution134();
    }

    @Test
    public void testCanCompleteCircuit_Case1() {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int actual = mTestSolution.canCompleteCircuit(gas, cost);
        int expected = 3;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testCanCompleteCircuit_Case2() {
        int[] gas = {2, 3, 4};
        int[] cost = {3, 4, 3};
        int actual = mTestSolution.canCompleteCircuit(gas, cost);
        int expected = -1;
        Assert.assertEquals(expected, actual);
    }
}