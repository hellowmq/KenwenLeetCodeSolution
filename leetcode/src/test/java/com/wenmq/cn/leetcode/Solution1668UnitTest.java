package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1668UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1668";

    private Solution1668 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1668();
    }

    @Test
    public void testMaxRepeating_Case1() {
        String sequence = "ababc";
        String word = "ab";
        int expected = 2;
        assertMoreSolution(sequence, word, expected);
    }

    @Test
    public void testMaxRepeating_Case2() {
        String sequence = "ababc";
        String word = "ba";
        int expected = 1;
        assertMoreSolution(sequence, word, expected);
    }

    @Test
    public void testMaxRepeating_Case3() {
        String sequence = "ababc";
        String word = "ac";
        int expected = 0;
        assertMoreSolution(sequence, word, expected);
    }

    private void assertMoreSolution(String sequence, String word, int expected) {
        Assert.assertEquals(expected, mTestSolution.maxRepeating(sequence, word));
        Assert.assertEquals(expected, mTestSolution.maxRepeating2(sequence, word));
    }
}