package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution500UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution500";


    private Solution500 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution500();
    }

    @Test
    public void testFindWords_Case1() {
        String[] words = new String[]{
                "Hello", "Alaska", "Dad", "Peace"
        };
        String[] expected = new String[]{
                "Alaska", "Dad"
        };
        Assert.assertArrayEquals(expected, mTestSolution.findWords(words));
    }

    @Test
    public void testFindWords_Case2() {
        String[] words = new String[]{
                "omk"
        };
        String[] expected = new String[]{
        };
        Assert.assertArrayEquals(expected, mTestSolution.findWords(words));
    }

    @Test
    public void testFindWords_Case3() {
        String[] words = new String[]{
                "adsdf", "sfd"
        };
        String[] expected = new String[]{
                "adsdf", "sfd"
        };
        Assert.assertArrayEquals(expected, mTestSolution.findWords(words));
    }
}