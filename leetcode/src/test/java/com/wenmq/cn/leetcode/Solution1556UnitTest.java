package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1556UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1556";

    private Solution1556 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1556();
    }

    @Test
    public void testThousandSeparator_Case1() {
        int n = 987;
        String expected = "987";
        Assert.assertEquals(expected, mTestSolution.thousandSeparator(n));
    }


    @Test
    public void testThousandSeparator_Case2() {
        int n = 1234;
        String expected = "1.234";
        Assert.assertEquals(expected, mTestSolution.thousandSeparator(n));
    }

    @Test
    public void testThousandSeparator_Case3() {
        int n = 123456789;
        String expected = "123.456.789";
        Assert.assertEquals(expected, mTestSolution.thousandSeparator(n));
    }

    @Test
    public void testThousandSeparator_Case4() {
        int n = 0;
        String expected = "0";
        Assert.assertEquals(expected, mTestSolution.thousandSeparator(n));
    }
}