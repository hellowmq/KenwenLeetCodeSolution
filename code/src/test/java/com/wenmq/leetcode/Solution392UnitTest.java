package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution392UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution392";
    private Solution392 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution392();
    }

    @Test
    public void testIsSubsequence_Case1() {
        String s = "ace";
        String t = "abcde";
        final boolean actual = mTestSolution.isSubsequence(s, t);
        final boolean expected = true;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testIsSubsequence_Case2() {
        String s = "abc";
        String t = "ahbgdc";
        final boolean actual = mTestSolution.isSubsequence(s, t);
        final boolean expected = true;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testIsSubsequence_Case3() {
        String s = "axc";
        String t = "ahbgdc";
        final boolean actual = mTestSolution.isSubsequence(s, t);
        final boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
}