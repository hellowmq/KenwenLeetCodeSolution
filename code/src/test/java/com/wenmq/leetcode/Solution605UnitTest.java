package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution605UnitTest {

    public static final String TAG = "com.wenmq.leetcode.Solution605";
    private Solution605 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution605();
    }

    @Test
    public void testCanPlaceFlowers_Case1() {
        int[] flowered = {1, 0, 0, 0, 1};
        int n = 1;
        boolean canPlaceFlowers = mTestSolution.canPlaceFlowers(flowered, n);
        final boolean expected = true;
        Assert.assertEquals(expected, canPlaceFlowers);
    }

    @Test
    public void testCanPlaceFlowers_Case2() {
        int[] flowered = {1, 0, 0, 0, 1};
        int n = 2;
        boolean canPlaceFlowers = mTestSolution.canPlaceFlowers(flowered, n);
        final boolean expected = false;
        Assert.assertEquals(expected, canPlaceFlowers);
    }

    @Test
    public void testCanPlaceFlowers_Case3() {
        int[] flowered = {1, 0, 0, 1, 1};
        int n = 2;
        boolean canPlaceFlowers = mTestSolution.canPlaceFlowers(flowered, n);
        final boolean expected = false;
        Assert.assertEquals(expected, canPlaceFlowers);
    }
}