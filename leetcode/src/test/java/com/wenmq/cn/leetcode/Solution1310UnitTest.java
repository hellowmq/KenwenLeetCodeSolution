package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1310UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1310";

    private Solution1310 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1310();
    }

    @Test
    public void testXorQueries_Case1() {
        int[] arr = {
                1, 3, 4, 8
        };
        int[][] queries = {
                {0, 1},
                {1, 2},
                {0, 3},
                {3, 3}
        };
        int[] expecteds = {
                2, 7, 14, 8
        };
        Assert.assertArrayEquals(expecteds, mTestSolution.xorQueries(arr, queries));
    }

    @Test
    public void testXorQueries_Case2() {
        int[] arr = {
                4, 8, 2, 10
        };
        int[][] queries = {
                {2, 3},
                {1, 3},
                {0, 0},
                {0, 3}
        };
        int[] expecteds = {
                8, 0, 4, 4
        };
        Assert.assertArrayEquals(expecteds, mTestSolution.xorQueries(arr, queries));
    }
}