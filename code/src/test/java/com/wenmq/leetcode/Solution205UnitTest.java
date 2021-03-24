package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution205UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution205";

    private Solution205 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution205();
    }

    @Test
    public void testIsIsomorphic_Case1() {
        String s = "egg";
        String t = "add";
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.isIsomorphic(s, t));
        Assert.assertEquals(expected, mTestSolution.isIsomorphic2(s, t));
    }

    @Test
    public void testIsIsomorphic_Case2() {
        String s = "foo";
        String t = "bar";
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.isIsomorphic(s, t));
        Assert.assertEquals(expected, mTestSolution.isIsomorphic2(s, t));
    }

    @Test
    public void testIsIsomorphic_Case3() {
        String s = "paper";
        String t = "title";
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.isIsomorphic(s, t));
        Assert.assertEquals(expected, mTestSolution.isIsomorphic2(s, t));
    }

}