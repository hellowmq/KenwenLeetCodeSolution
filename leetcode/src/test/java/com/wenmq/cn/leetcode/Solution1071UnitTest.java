package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1071UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1071";

    private Solution1071 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1071();
    }

    @Test
    public void testGcdOfStrings_Case1() {
        String str1 = "ABCABC";
        String str2 = "ABC";
        String expected = "ABC";
        Assert.assertEquals(expected, mTestSolution.gcdOfStrings(str1, str2));
    }

    @Test
    public void testGcdOfStrings_Case2() {
        String str1 = "ABABAB";
        String str2 = "ABAB";
        String expected = "AB";
        Assert.assertEquals(expected, mTestSolution.gcdOfStrings(str1, str2));
    }

    @Test
    public void testGcdOfStrings_Case3() {
        String str1 = "LEET";
        String str2 = "CODE";
        String expected = "";
        Assert.assertEquals(expected, mTestSolution.gcdOfStrings(str1, str2));
    }
}
