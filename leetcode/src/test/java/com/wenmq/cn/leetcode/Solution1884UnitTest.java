package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1884UnitTest {

    private Solution1884 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1884();
    }

    @Test
    public void testReplaceDigits_Case1() {
        String s = "a1c1e1";
        String expected = "abcdef";
        Assert.assertEquals(expected, mTestSolution.replaceDigits(s));
    }

    @Test
    public void testReplaceDigits_Case2() {
        String s = "a1b2c3d4e";
        String expected = "abbdcfdhe";
        Assert.assertEquals(expected, mTestSolution.replaceDigits(s));
    }
}