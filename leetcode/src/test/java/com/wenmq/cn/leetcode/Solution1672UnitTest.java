package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1672UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1672";

    private Solution1672 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1672();
    }

    @Test
    public void testMaximumWealth_Case1() {
        int[][] a = {
                {1, 2, 3}, {3, 2, 1}
        };
        int expected = 6;
        Assert.assertEquals(expected, mTestSolution.maximumWealth(a));
    }

    @Test
    public void testMaximumWealth_Case2() {
        int[][] a = {
                {1, 5}, {7, 3}, {3, 5}
        };
        int expected = 10;
        Assert.assertEquals(expected, mTestSolution.maximumWealth(a));
    }

    @Test
    public void testMaximumWealth_Case3() {
        int[][] a = {
                {2, 8, 7}, {7, 1, 3}, {1, 9, 5}
        };
        int expected = 17;
        Assert.assertEquals(expected, mTestSolution.maximumWealth(a));
    }
}