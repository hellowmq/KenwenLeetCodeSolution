package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1967UnitTest {

    private Solution1967 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1967();
    }

    @Test
    public void test_numOfStrings_Case1() {
        String[] patterns = new String[]{
                "a", "abc", "bc", "d"
        };
        String word = "abc";
        int expected = 3;
        Assert.assertEquals(expected, mTestSolution.numOfStrings(patterns, word));
    }

    @Test
    public void test_numOfStrings_Case2() {
        String[] patterns = new String[]{
                "a", "b", "c"
        };
        String word = "aaaaabbbbb";
        int expected = 2;
        Assert.assertEquals(expected, mTestSolution.numOfStrings(patterns, word));
    }

    @Test
    public void test_numOfStrings_Case3() {
        String[] patterns = new String[]{
                "a", "a", "a"
        };
        String word = "ab";
        int expected = 3;
        Assert.assertEquals(expected, mTestSolution.numOfStrings(patterns, word));
    }
}