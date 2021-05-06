package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1399UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1399";

    private Solution1399 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1399();
    }

    @Test
    public void testCountLargestGroup_Case1() {
        int n = 13;
        int expected = 4;
        Assert.assertEquals(expected, mTestSolution.countLargestGroup(n));
    }

    @Test
    public void testCountLargestGroup_Case2() {
        int n = 2;
        int expected = 2;
        Assert.assertEquals(expected, mTestSolution.countLargestGroup(n));
    }

    @Test
    public void testCountLargestGroup_Case3() {
        int n = 15;
        int expected = 6;
        Assert.assertEquals(expected, mTestSolution.countLargestGroup(n));
    }

    @Test
    public void testCountLargestGroup_Case4() {
        int n = 24;
        int expected = 5;
        Assert.assertEquals(expected, mTestSolution.countLargestGroup(n));
    }

    @Test
    public void testCountLargestGroup_Case5() {
        int n = 10000;
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.countLargestGroup(n));
    }

    @Test
    public void testCountLargestGroup_Case6() {
        int n = 9998;
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.countLargestGroup(n));
    }
}