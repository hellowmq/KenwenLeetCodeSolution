package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution868UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution868";
    private Solution868 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution868();
    }

    @Test
    public void testBinaryGap_Case1() {
        int n = 22;
        int actual = mTestSolution.binaryGap(n);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBinaryGap_Case2() {
        int n = 5;
        int actual = mTestSolution.binaryGap(n);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBinaryGap_Case3() {
        int n = 6;
        int actual = mTestSolution.binaryGap(n);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBinaryGap_Case4() {
        int n = 8;
        int actual = mTestSolution.binaryGap(n);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBinaryGap_Case5() {
        int n = 1;
        int actual = mTestSolution.binaryGap(n);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testBinaryGap_Case6() {
        int n = 0x4C;// 01001100
        int actual = mTestSolution.binaryGap(n);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

}