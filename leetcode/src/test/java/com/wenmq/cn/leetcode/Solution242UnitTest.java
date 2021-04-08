package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution242UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution242";

    private Solution242 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution242();
    }

    @Test
    public void testIsAnagram_Case1() {
        String s = "anagram";
        String t = "nagaram";
        boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.isAnagram(s, t));
        Assert.assertEquals(expected, mTestSolution.isAnagram2(s, t));

    }

    @Test
    public void testIsAnagram_Case2() {
        String s = "rat";
        String t = "car";
        boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.isAnagram(s, t));
        Assert.assertEquals(expected, mTestSolution.isAnagram2(s, t));
    }

    @Test
    public void testIsAnagram_CaseNull() {
        String s = "rat";
        String t = null;
        boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.isAnagram(s, t));
        Assert.assertEquals(expected, mTestSolution.isAnagram2(s, t));
    }

    @Test
    public void testIsAnagram_CaseLength() {
        String s = "rat";
        String t = "null";
        boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.isAnagram(s, t));
        Assert.assertEquals(expected, mTestSolution.isAnagram2(s, t));
    }
}