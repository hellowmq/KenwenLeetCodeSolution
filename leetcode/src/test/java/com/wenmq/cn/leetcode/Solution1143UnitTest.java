package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1143UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1143";

    private Solution1143 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1143();
    }

    @Test
    public void testLongestCommonSubsequence_Case1() {
        String text1 = "abcde";
        String text2 = "ace";
        int expected = 3;
        Assert.assertEquals(expected, mTestSolution.longestCommonSubsequence(text1, text2));
        Assert.assertEquals(expected, mTestSolution.longestCommonSubsequence2(text1, text2));
    }

    @Test
    public void testLongestCommonSubsequence_Case2() {
        String text1 = "abc";
        String text2 = "abc";
        int expected = 3;
        Assert.assertEquals(expected, mTestSolution.longestCommonSubsequence(text1, text2));
        Assert.assertEquals(expected, mTestSolution.longestCommonSubsequence2(text1, text2));
    }

    @Test
    public void testLongestCommonSubsequence_Case3() {
        String text1 = "abc";
        String text2 = "def";
        int expected = 0;
        Assert.assertEquals(expected, mTestSolution.longestCommonSubsequence(text1, text2));
        Assert.assertEquals(expected, mTestSolution.longestCommonSubsequence2(text1, text2));
    }
}