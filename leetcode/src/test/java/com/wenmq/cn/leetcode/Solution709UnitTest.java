package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution709UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution709";


    private Solution709 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution709();
    }

    @Test
    public void testToLowerCase_Case1() {
        String s = "Hello";
        String expected = "hello";
        assertMoreSolution(s, expected);
    }

    @Test
    public void testToLowerCase_Case2() {
        String s = "here";
        String expected = "here";
        assertMoreSolution(s, expected);
    }

    @Test
    public void testToLowerCase_Case3() {
        String s = "LOVELY";
        String expected = "lovely";
        assertMoreSolution(s, expected);
    }

    @Test
    public void testToLowerCase_Case4() {
        String s = "Hello@[]";
        String expected = "hello@[]";
        assertMoreSolution(s, expected);
    }

    private void assertMoreSolution(String s, String expected) {
        Assert.assertEquals(expected, mTestSolution.toLowerCase(s));
        Assert.assertEquals(expected, mTestSolution.toLowerCase2(s));
        Assert.assertEquals(expected, mTestSolution.toLowerCase3(s));
    }
}