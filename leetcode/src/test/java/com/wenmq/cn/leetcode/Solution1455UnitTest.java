package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1455UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1455";

    private Solution1455 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1455();
    }

    @Test
    public void testIsPrefixOfWord_Case1() {
        String sentence = "i love eating burger";
        String searchWord = "burg";
        int expected = 4;
        Assert.assertEquals(expected, mTestSolution.isPrefixOfWord(sentence, searchWord));
    }

    @Test
    public void testIsPrefixOfWord_Case2() {
        String sentence = "this problem is an easy problem";
        String searchWord = "pro";
        int expected = 2;
        Assert.assertEquals(expected, mTestSolution.isPrefixOfWord(sentence, searchWord));
    }

    @Test
    public void testIsPrefixOfWord_Case3() {
        String sentence = "i am tired";
        String searchWord = "you";
        int expected = -1;
        Assert.assertEquals(expected, mTestSolution.isPrefixOfWord(sentence, searchWord));
    }

    @Test
    public void testIsPrefixOfWord_Case4() {
        String sentence = "i use triple pillow";
        String searchWord = "pill";
        int expected = 4;
        Assert.assertEquals(expected, mTestSolution.isPrefixOfWord(sentence, searchWord));
    }

    @Test
    public void testIsPrefixOfWord_Case5() {
        String sentence = "hello from the other side";
        String searchWord = "they";
        int expected = -1;
        Assert.assertEquals(expected, mTestSolution.isPrefixOfWord(sentence, searchWord));
    }
}