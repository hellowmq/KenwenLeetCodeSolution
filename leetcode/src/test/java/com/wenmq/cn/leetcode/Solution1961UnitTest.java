package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1961UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1961";


    private Solution1961 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1961();
    }

    @Test
    public void testIsPrefixString_Case1() {
        String s = "iloveleetcode";
        String[] words = new String[]{
                "i", "love", "leetcode", "apples"
        };
        final boolean expected = true;
        assertMoreSolution(s, words, expected);
    }

    @Test
    public void testIsPrefixString_Case2() {
        String s = "iloveleetcode";
        String[] words = new String[]{
                "apples", "i", "love", "leetcode"
        };
        final boolean expected = false;
        assertMoreSolution(s, words, expected);
    }

    @Test
    public void testIsPrefixString_Case3() {
        String s = "iloveleetcode";
        String[] words = new String[]{
                "i", "love"
        };
        final boolean expected = false;
        assertMoreSolution(s, words, expected);
    }

    @Test
    public void testIsPrefixString_Case4() {
        String s = "a";
        String[] words = new String[]{
                "aa", "aaaa", "banana"
        };
        final boolean expected = false;
        assertMoreSolution(s, words, expected);
    }

    private void assertMoreSolution(String s, String[] words, boolean expected) {
        Assert.assertEquals(expected, mTestSolution.isPrefixString(s, words));
        Assert.assertEquals(expected, mTestSolution.isPrefixString2(s, words));
    }
}