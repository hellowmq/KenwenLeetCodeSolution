package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution76UnitTest {

    private Solution76 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution76();
    }

    @Test
    public void test_MinWindow_Case1() {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String expected = "BANC";
        assertMoreSolution(s, t, expected);
    }

    @Test
    public void test_MinWindow_Case2() {
        String s = "a";
        String t = "a";
        String expected = "a";
        assertMoreSolution(s, t, expected);
    }

    @Test
    public void test_MinWindow_Case3() {
        String s = "a";
        String t = "aa";
        String expected = "";
        assertMoreSolution(s, t, expected);
    }

    @Test
    public void test_MinWindow_Case4() {
        String s = "cabwefgewcwaefgcf";
        String t = "cae";
        String expected = "cwae";
        assertMoreSolution(s, t, expected);
    }

    private void assertMoreSolution(String s, String t, String expected) {
        Assert.assertEquals(expected, mTestSolution.minWindow(s, t));
        Assert.assertEquals(expected, mTestSolution.minWindow2(s, t));
    }
}