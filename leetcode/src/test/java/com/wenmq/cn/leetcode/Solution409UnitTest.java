package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution409UnitTest {

    private Solution409 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution409();
    }

    @Test
    public void testLongestPalindrome_Case() {
        String s = "abccccdd";
        int expected = 7;
        Assert.assertEquals(expected, mTestSolution.longestPalindrome(s));
        Assert.assertEquals(expected, mTestSolution.longestPalindrome2(s));
        Assert.assertEquals(expected, mTestSolution.longestPalindrome3(s));
    }
}