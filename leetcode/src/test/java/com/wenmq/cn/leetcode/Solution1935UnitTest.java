package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1935UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1935";

    private Solution1935 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1935();
    }

    @Test
    public void testCanBeTypedWords_Case1() {
        String text = "hello world";
        String brokenLetters = "ad";
        int expected = 1;
        assertMoreSolution(text, brokenLetters, expected);
    }

    @Test
    public void testCanBeTypedWords_Case2() {
        String text = "leet code";
        String brokenLetters = "lt";
        int expected = 1;
        assertMoreSolution(text, brokenLetters, expected);
    }

    @Test
    public void testCanBeTypedWords_Case3() {
        String text = "leet code";
        String brokenLetters = "e";
        int expected = 0;
        assertMoreSolution(text, brokenLetters, expected);
    }

    private void assertMoreSolution(String text, String brokenLetters, int expected) {
        Assert.assertEquals(expected, mTestSolution.canBeTypedWords(text, brokenLetters));
        Assert.assertEquals(expected, mTestSolution.canBeTypedWords2(text, brokenLetters));
    }
}