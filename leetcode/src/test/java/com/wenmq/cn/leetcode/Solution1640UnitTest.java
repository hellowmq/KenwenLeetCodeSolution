package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1640UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1640";

    private Solution1640 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1640();
    }

    @Test
    public void testCanFormArray_Case1() {
        int[] arr = {85};
        int[][] pieces = {{85}};
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.canFormArray(arr, pieces));
    }

    @Test
    public void testCanFormArray_Case2() {
        int[] arr = {15, 88};
        int[][] pieces = {{88}, {15}};
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.canFormArray(arr, pieces));
    }

    @Test
    public void testCanFormArray_Case3() {
        int[] arr = {49, 18, 16};
        int[][] pieces = {{16, 18, 49}};
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.canFormArray(arr, pieces));
    }

    @Test
    public void testCanFormArray_Case4() {
        int[] arr = {91, 4, 64, 78};
        int[][] pieces = {{78}, {4, 64}, {91}};
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.canFormArray(arr, pieces));
    }

    @Test
    public void testCanFormArray_Case5() {
        int[] arr = {1, 3, 5, 7};
        int[][] pieces = {{2, 4, 6, 8}};
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.canFormArray(arr, pieces));
    }

    @Test
    public void testCanFormArray_Case6() {
        int[] arr = {91, 4, 64, 78};
        int[][] pieces = {{64}, {4, 78}, {91}};
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.canFormArray(arr, pieces));
    }
}