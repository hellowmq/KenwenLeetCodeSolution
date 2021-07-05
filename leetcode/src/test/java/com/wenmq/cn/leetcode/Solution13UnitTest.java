package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("SpellCheckingInspection")
public class Solution13UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution13";

    private Solution13 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution13();

    }

    @Test
    public void testRomanToInt_case1() {
        String s = "III";
        int expected = 3;

        int romanToInt = mTestSolution.romanToInt(s);
        Assert.assertEquals(expected, romanToInt);
    }

    @Test
    public void testRomanToInt_case2() {
        String s = "IV";
        int expected = 4;

        int romanToInt = mTestSolution.romanToInt(s);
        Assert.assertEquals(expected, romanToInt);
    }

    @Test
    public void testRomanToInt_case3() {
        String s = "IX";
        int expected = 9;

        int romanToInt = mTestSolution.romanToInt(s);
        Assert.assertEquals(expected, romanToInt);
    }

    @Test
    public void testRomanToInt_case4() {
        String s = "LVIII";
        int expected = 58;

        int romanToInt = mTestSolution.romanToInt(s);
        Assert.assertEquals(expected, romanToInt);
    }

    @Test
    public void testRomanToInt_case5() {
        String s = "MCMXCIV";
        int expected = 1994;

        int romanToInt = mTestSolution.romanToInt(s);
        Assert.assertEquals(expected, romanToInt);
    }

    @Test
    public void testRomanToInt_case6() {
        String s = "DXCIV";
        int expected = 594;

        int romanToInt = mTestSolution.romanToInt(s);
        Assert.assertEquals(expected, romanToInt);
    }


}