package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Solution290UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution0290";
    private Solution290 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution290();
    }

    @Test
    public void testWordPattern_case1() {
        String pattern = "abba";
        String s = "dog cat cat dog";
        Assert.assertTrue(mTestSolution.wordPattern(pattern, s));
    }

    @Test
    public void testWordPattern_case2() {
        String pattern = "abba";
        String s = "dog cat cat fish";
        Assert.assertFalse(mTestSolution.wordPattern(pattern, s));
    }

    @Test
    public void testWordPattern_case3() {
        String pattern = "aaaa";
        String s = "dog cat cat dog";
        Assert.assertFalse(mTestSolution.wordPattern(pattern, s));
    }

    @Test
    public void testWordPattern_case4() {
        String pattern = "abba";
        String s = "dog dog dog dog";
        Assert.assertFalse(mTestSolution.wordPattern(pattern, s));
    }

    @Test
    public void testWordPattern_case5() {
        String pattern = "ab";
        String s = "dg";
        Assert.assertFalse(mTestSolution.wordPattern(pattern, s));
    }
}