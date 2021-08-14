package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1957UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1957";


    private Solution1957 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1957();
    }

    @Test
    public void testMakeFancyString_Case1() {
        String s = "leeetcode";
        String expected = "leetcode";
        assertMoreSolution(s, expected);
    }

    @Test
    public void testMakeFancyString_Case2() {
        String s = "aaabaaaa";
        String expected = "aabaa";
        assertMoreSolution(s, expected);
    }

    @Test
    public void testMakeFancyString_Case3() {
        String s = "aab";
        String expected = "aab";
        assertMoreSolution(s, expected);
    }

    @Test
    public void testMakeFancyString_Case4() {
        String s = "ab";
        String expected = "ab";
        assertMoreSolution(s, expected);
    }

    private void assertMoreSolution(String s, String expected) {
        Assert.assertEquals(expected, mTestSolution.makeFancyString(s));
        Assert.assertEquals(expected, mTestSolution.makeFancyString2(s));
        Assert.assertEquals(expected, mTestSolution.makeFancyString3(s));
    }
}