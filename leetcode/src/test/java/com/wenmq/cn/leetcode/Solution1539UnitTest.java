package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1539UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1539";

    private Solution1539 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1539();
    }

    @Test
    public void testFindKthPositive_Case1() {
        int[] arr = new int[]{
                2, 3, 4, 7, 11
        };
        int k = 5;
        int expected = 9;
        Assert.assertEquals(expected, mTestSolution.findKthPositive(arr, k));
    }

    @Test
    public void testFindKthPositive_Case2() {
        int[] arr = new int[]{
                1, 2, 3, 4
        };
        int k = 2;
        int expected = 6;
        Assert.assertEquals(expected, mTestSolution.findKthPositive(arr, k));
    }
}