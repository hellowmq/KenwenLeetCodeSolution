package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution3UnitTest {

    private Solution3 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution3();
    }

    @Test
    public void test_LengthOfLongestSubstring_Case1() {
        String s = "abcabcbb";
        int expected = 3;
        Assert.assertEquals(expected, mTestSolution.lengthOfLongestSubstring(s));
    }

    @Test
    public void test_LengthOfLongestSubstring_Case2() {
        String s = "bbbbb";
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.lengthOfLongestSubstring(s));
    }

    @Test
    public void test_LengthOfLongestSubstring_Case3() {
        String s = "pwwkew";
        int expected = 3;
        Assert.assertEquals(expected, mTestSolution.lengthOfLongestSubstring(s));
    }

    @Test
    public void test_LengthOfLongestSubstring_Case4() {
        int expected = 0;
        String s = "";
        Assert.assertEquals(expected, mTestSolution.lengthOfLongestSubstring(s));
    }
}