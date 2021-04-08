package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution349UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution349";
    private Solution349 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution349();
    }

    @Test
    public void testIntersection_Case1() {
        int[] num1 = new int[]{1, 2, 2, 1};
        int[] num2 = new int[]{2, 2};
        int[] expected = new int[]{2};
        Assert.assertArrayEquals(expected, mTestSolution.intersection(num1, num2));
        Assert.assertArrayEquals(expected, mTestSolution.intersection2(num1, num2));
    }

    @Test
    public void testIntersection_Case2() {
        int[] num1 = new int[]{4, 9, 5};
        int[] num2 = new int[]{9, 4, 9, 8, 4};
        int[] expected = new int[]{9, 4};
        Assert.assertArrayEquals(expected, mTestSolution.intersection(num1, num2));
        int[] expected2 = new int[]{4, 9};
        Assert.assertArrayEquals(expected2, mTestSolution.intersection2(num1, num2));
    }
}