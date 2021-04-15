package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1704UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1704";

    private Solution1704 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1704();
    }

    @Test
    public void testHalvesAreAlike_Case1() {
        String s = "book";
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.halvesAreAlike(s));
    }

    @Test
    public void testHalvesAreAlike_Case2() {
        String s = "textbook";
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.halvesAreAlike(s));
    }

    @Test
    public void testHalvesAreAlike_Case3() {
        String s = "MerryChristmas";
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.halvesAreAlike(s));
    }

    @Test
    public void testHalvesAreAlike_Case4() {
        String s = "AbCdEfGh";
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.halvesAreAlike(s));
    }
}