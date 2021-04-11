package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1768UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1768";

    private Solution1768 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1768();
    }

    @Test
    public void testMergeAlternately_Case1() {
        String word1 = "abc";
        String word2 = "pqr";
        String expected = "apbqcr";
        Assert.assertEquals(expected, mTestSolution.mergeAlternately(word1, word2));
        Assert.assertEquals(expected, mTestSolution.mergeAlternately2(word1, word2));
    }

    @Test
    public void testMergeAlternately_Case2() {
        String word1 = "ab";
        String word2 = "pqrs";
        String expected = "apbqrs";
        Assert.assertEquals(expected, mTestSolution.mergeAlternately(word1, word2));
        Assert.assertEquals(expected, mTestSolution.mergeAlternately2(word1, word2));
    }

    @Test
    public void testMergeAlternately_Case3() {
        String word1 = "abcd";
        String word2 = "pq";
        String expected = "apbqcd";
        Assert.assertEquals(expected, mTestSolution.mergeAlternately(word1, word2));
        Assert.assertEquals(expected, mTestSolution.mergeAlternately2(word1, word2));
    }
}