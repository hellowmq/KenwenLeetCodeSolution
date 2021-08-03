package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution415UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution415";


    private Solution415 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution415();
    }

    @Test
    public void testAddStrings_Case1() {
        String num1 = "11";
        String num2 = "123";
        String expected = "134";
        assertMoreSolution(num1, num2, expected);
    }

    @Test
    public void testAddStrings_Case3() {
        String num1 = "11";
        String num2 = "89";
        String expected = "100";
        assertMoreSolution(num1, num2, expected);
    }

    private void assertMoreSolution(String num1, String num2, String expected) {
        Assert.assertEquals(expected, mTestSolution.addStrings(num1, num2));
        Assert.assertEquals(expected, mTestSolution.addStrings2(num1, num2));
    }
}