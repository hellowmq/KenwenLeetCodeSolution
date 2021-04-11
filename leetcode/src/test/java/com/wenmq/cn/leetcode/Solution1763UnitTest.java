package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1763UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1763";

    private Solution1763 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1763();
    }

    @Test
    public void testLongestNiceSubstring_Case1() {
        String s = "YazaAay";

        String expected = "aAa";
        Assert.assertEquals(expected, mTestSolution.longestNiceSubstring(s));
    }

    @Test
    public void testLongestNiceSubstring_Case2() {
        String s = "Bb";

        String expected = "Bb";
        Assert.assertEquals(expected, mTestSolution.longestNiceSubstring(s));
    }

    @Test
    public void testLongestNiceSubstring_Case3() {
        String s = "c";

        String expected = "";
        Assert.assertEquals(expected, mTestSolution.longestNiceSubstring(s));
    }

    @Test
    public void testLongestNiceSubstring_Case4() {
        String s = "dDzeE";

        String expected = "dD";
        Assert.assertEquals(expected, mTestSolution.longestNiceSubstring(s));
    }
}