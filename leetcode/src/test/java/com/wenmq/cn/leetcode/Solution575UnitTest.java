package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution575UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution575";
    private Solution575 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution575();
    }

    @Test
    public void testDistributeCandies_Case1() {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int expected = 3;
        assertMoreSolution(candyType, expected);
    }

    @Test
    public void testDistributeCandies_Case2() {
        int[] candyType = {1, 1, 2, 3};
        int expected = 2;
        assertMoreSolution(candyType, expected);
    }

    @Test
    public void testDistributeCandies_Case3() {
        int[] candyType = {1, 1, 1, 1};
        int expected = 1;
        assertMoreSolution(candyType, expected);
    }

    private void assertMoreSolution(int[] candyType, int expected) {
        Assert.assertEquals(expected, mTestSolution.distributeCandies(candyType));
        Assert.assertEquals(expected, mTestSolution.distributeCandies2(candyType));
    }
}