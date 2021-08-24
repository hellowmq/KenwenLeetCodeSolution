package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1011UnitTest {

    private Solution1011 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1011();
    }

    @Test
    public void test_ShipWithinDays_Case1() {
        int[] weights = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };
        int days = 5;
        int expected = 15;
        Assert.assertEquals(expected, mTestSolution.shipWithinDays(weights, days));
    }

    @Test
    public void test_ShipWithinDays_Case2() {
        int[] weights = new int[]{
                3, 2, 2, 4, 1, 4
        };
        int days = 3;
        int expected = 6;
        Assert.assertEquals(expected, mTestSolution.shipWithinDays(weights, days));
    }

    @Test
    public void test_ShipWithinDays_Case3() {
        int[] weights = new int[]{
                1, 2, 3, 1, 1
        };
        int days = 4;
        int expected = 3;
        Assert.assertEquals(expected, mTestSolution.shipWithinDays(weights, days));
    }
}