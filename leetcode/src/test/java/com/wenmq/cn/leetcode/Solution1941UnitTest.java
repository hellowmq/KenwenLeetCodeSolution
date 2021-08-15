package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1941UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1941";


    private Solution1941 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1941();
    }

    @Test
    public void testAreOccurrencesEqual_Case1() {
        String s = "abacbc";
        final boolean expected = true;
        assertMoreSolution(s, expected);
    }

    @Test
    public void testAreOccurrencesEqual_Case2() {
        String s = "aaabb";
        final boolean expected = false;
        assertMoreSolution(s, expected);
    }

    private void assertMoreSolution(String s, boolean expected) {
        Assert.assertEquals(expected, mTestSolution.areOccurrencesEqual(s));
        Assert.assertEquals(expected, mTestSolution.areOccurrencesEqual2(s));
    }
}