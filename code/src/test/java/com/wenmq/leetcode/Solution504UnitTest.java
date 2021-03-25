package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution504UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution504";

    private Solution504 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution504();
    }

    @Test
    public void testConvertToBase7_Case1() {
        String expected = "202";
        int num = 100;
        Assert.assertEquals(expected, mTestSolution.convertToBase7(num));
        Assert.assertEquals(expected, mTestSolution.convertToBase7S2(num));

    }

    @Test
    public void testConvertToBase7_Case2() {
        String expected = "-10";
        int num = -7;
        Assert.assertEquals(expected, mTestSolution.convertToBase7(num));
        Assert.assertEquals(expected, mTestSolution.convertToBase7S2(num));
    }

    @Test
    public void testConvertToBase7_Case3() {
        String expected = "0";
        int num = 0;
        Assert.assertEquals(expected, mTestSolution.convertToBase7(num));
        Assert.assertEquals(expected, mTestSolution.convertToBase7S2(num));
    }
}