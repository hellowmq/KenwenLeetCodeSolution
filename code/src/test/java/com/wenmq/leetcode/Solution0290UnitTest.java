package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution0290UnitTest {

    String TAG = "com.wenmq.leetcode.Solution0290";
    private Solution0290 mTestSolution;


    @Before
    public void setUp() throws Exception {

        mTestSolution = new Solution0290();
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
}