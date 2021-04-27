package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1534UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1534";

    private Solution1534 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1534();
    }

    @Test
    public void testCountGoodTriplets_Case1() {
        int[] arr = new int[]{
                3, 0, 1, 1, 9, 7
        };
        int a = 7;
        int b = 2;
        int c = 3;
        int expected = 4;
        Assert.assertEquals(expected, mTestSolution.countGoodTriplets(arr, a, b, c));
        Assert.assertEquals(expected, mTestSolution.countGoodTriplets2(arr, a, b, c));
    }

    @Test
    public void testCountGoodTriplets_Case2() {
        int[] arr = new int[]{
                1, 1, 2, 2, 3
        };
        int a = 0;
        int b = 0;
        int c = 1;
        int expected = 0;
        Assert.assertEquals(expected, mTestSolution.countGoodTriplets(arr, a, b, c));
        Assert.assertEquals(expected, mTestSolution.countGoodTriplets2(arr, a, b, c));
    }
}