package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution459UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution459";


    private Solution459 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution459();
    }

    @Test
    public void testRepeatedSubstringPattern_Case1() {
        String s = "abab";
        final boolean expected = true;
        assertMoreSolution(s, expected);
    }

    @Test
    public void testRepeatedSubstringPattern_Case2() {
        String s = "aba";
        final boolean expected = false;
        assertMoreSolution(s, expected);
    }

    @Test
    public void testRepeatedSubstringPattern_Case3() {
        String s = "abcabcabcabc";
        final boolean expected = true;
        assertMoreSolution(s, expected);
    }

    private void assertMoreSolution(String s, boolean expected) {
        Assert.assertEquals(expected, mTestSolution.repeatedSubstringPattern(s));
        Assert.assertEquals(expected, mTestSolution.repeatedSubstringPattern2(s));
    }
}