package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution345UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution345";

    private Solution345 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution345();
    }

    @Test
    public void testReverseVowels_Case1() {
        String s = "hello";
        String expected = "holle";
        Assert.assertEquals(expected, mTestSolution.reverseVowels(s));
    }

    @Test
    public void testReverseVowels_Case2() {
        String s = "leetcode";
        String expected = "leotcede";
        Assert.assertEquals(expected, mTestSolution.reverseVowels(s));
    }
}