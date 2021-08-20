package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution541UnitTest {

    private Solution541 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution541();
    }

    @Test
    public void testReverseStr_Case1() {
        String s = "abcdefg";
        int k = 2;
        String expected = "bacdfeg";
        Assert.assertEquals(expected, mTestSolution.reverseStr(s, k));
    }

    @Test
    public void testReverseStr_Case2() {
        String s = "abcd";
        int k = 2;
        String expected = "bacd";
        Assert.assertEquals(expected, mTestSolution.reverseStr(s, k));
    }
}