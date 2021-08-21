package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution370UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution370";


    private Solution370 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution370();
    }

    @Test
    public void testGetModifiedArray_Case1() {
        int length = 5;
        int[][] updates = new int[][]{
                {1, 3, 2},
                {2, 4, 3},
                {0, 2, -2},
        };
        int[] expected = new int[]{
                -2, 0, 3, 5, 3
        };
        Assert.assertArrayEquals(expected, mTestSolution.getModifiedArray(length, updates));
        Assert.assertArrayEquals(expected, mTestSolution.getModifiedArray2(length, updates));
    }
}