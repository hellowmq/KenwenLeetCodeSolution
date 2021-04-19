package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1624UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1624";

    private Solution1624 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1624();
    }

    @Test
    public void testMaxLengthBetweenEqualCharacters_Case1() {
        String s = "aa";
        int expected = 0;
        assertMoreSolution(s, expected);
    }

    @Test
    public void testMaxLengthBetweenEqualCharacters_Case2() {
        String s = "abca";
        int expected = 2;
        assertMoreSolution(s, expected);
    }

    @Test
    public void testMaxLengthBetweenEqualCharacters_Case3() {
        String s = "cbzxy";
        int expected = -1;
        assertMoreSolution(s, expected);
    }

    @Test
    public void testMaxLengthBetweenEqualCharacters_Case4() {
        String s = "cabbac";
        int expected = 4;
        assertMoreSolution(s, expected);
    }

    private void assertMoreSolution(String s, int expected) {
        Assert.assertEquals(expected, mTestSolution.maxLengthBetweenEqualCharacters(s));
        Assert.assertEquals(expected, mTestSolution.maxLengthBetweenEqualCharacters2(s));
    }
}