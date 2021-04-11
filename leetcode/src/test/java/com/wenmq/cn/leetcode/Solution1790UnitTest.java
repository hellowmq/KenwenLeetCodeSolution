package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1790UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1790";

    private Solution1790 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1790();
    }

    @Test
    public void testAreAlmostEqual_Case1() {
        String s1 = "bank";
        String s2 = "kanb";
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.areAlmostEqual(s1, s2));
    }

    @Test
    public void testAreAlmostEqual_Case2() {
        String s1 = "attack";
        String s2 = "defend";
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.areAlmostEqual(s1, s2));
    }

    @Test
    public void testAreAlmostEqual_Case3() {
        String s1 = "kelb";
        String s2 = "kelb";
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.areAlmostEqual(s1, s2));
    }

    @Test
    public void testAreAlmostEqual_Case4() {
        String s1 = "abcd";
        String s2 = "dcba";
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.areAlmostEqual(s1, s2));
    }

    @Test
    public void testAreAlmostEqual_Case5() {
        String s1 = "abcd";
        String s2 = "badc";
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.areAlmostEqual(s1, s2));
    }
}