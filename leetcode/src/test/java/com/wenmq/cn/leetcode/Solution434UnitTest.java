package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution434UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution434";

    private Solution434 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution434();
    }

    @Test
    public void testCountSegments_Case1() {
        String str = "Hello, my name is John";
        int expected = 5;
        Assert.assertEquals(expected, mTestSolution.countSegments(str));
    }

    @Test
    public void testCountSegments_Case2() {
        String str = "                ";
        int expected = 0;
        Assert.assertEquals(expected, mTestSolution.countSegments(str));
    }

    @Test
    public void testCountSegments_() {
        String str = "    foo    bar";
        int expected = 2;
        Assert.assertEquals(expected, mTestSolution.countSegments(str));
    }
}