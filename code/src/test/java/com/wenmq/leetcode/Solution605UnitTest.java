package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution605UnitTest {

    String TAG = "com.wenmq.leetcode.Solution605";
    private Solution605 mTestSolutioin;


    @Before
    public void setUp() throws Exception {
        mTestSolutioin = new Solution605();
    }

    @Test
    public void testCanPlaceFlowers_Case1() {
        int [] flowered = {1,0,0,0,1};
        int n = 1;
        boolean canPlaceFlowers = mTestSolutioin.canPlaceFlowers(flowered, n);
        boolean expected = true;
        Assert.assertEquals(expected, canPlaceFlowers);
    }

    @Test
    public void testCanPlaceFlowers_Case2() {
        int [] flowered = {1,0,0,0,1};
        int n = 2;
        boolean canPlaceFlowers = mTestSolutioin.canPlaceFlowers(flowered, n);
        boolean expected = false;
        Assert.assertEquals(expected, canPlaceFlowers);
    }
}