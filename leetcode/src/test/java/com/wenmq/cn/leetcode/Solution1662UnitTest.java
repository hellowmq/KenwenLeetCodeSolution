package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1662UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1662";

    private Solution1662 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1662();
    }

    @Test
    public void testArrayStringsAreEqual_Case1() {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        final boolean expected = true;
        assertMoreSolutions(word1, word2, expected);
    }

    @Test
    public void testArrayStringsAreEqual_Case2() {
        String[] word1 = {"a", "cb"};
        String[] word2 = {"a", "bc"};
        final boolean expected = false;
        assertMoreSolutions(word1, word2, expected);
    }

    @Test
    public void testArrayStringsAreEqual_Case3() {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        final boolean expected = true;
        assertMoreSolutions(word1, word2, expected);
    }

    @Test
    public void testArrayStringsAreEqual_Case4() {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddef"};
        final boolean expected = false;
        assertMoreSolutions(word1, word2, expected);
    }

    private void assertMoreSolutions(String[] word1, String[] word2, boolean expected) {
        Assert.assertEquals(expected, mTestSolution.arrayStringsAreEqual(word1, word2));
        Assert.assertEquals(expected, mTestSolution.arrayStringsAreEqual2(word1, word2));
    }
}