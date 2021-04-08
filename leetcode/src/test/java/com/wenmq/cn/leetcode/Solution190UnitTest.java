package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution190UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution190";

    private Solution190 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution190();
    }

    @Test
    public void testReverseBits_Case1() {
        int n = Integer.valueOf(replaceMinus("00000010100101000001111010011100"), 2);
        int expected = Integer.valueOf(replaceMinus("00111001011110000010100101000000"), 2);
        Assert.assertEquals(expected, mTestSolution.reverseBits(n));
    }

    @Test
    public void testReverseBits_Case2() {
        int n = Integer.valueOf(replaceMinus("11111111111111111111111111111101"), 2);
        int expected = Integer.valueOf(replaceMinus("10111111111111111111111111111111"), 2);
        Assert.assertEquals(expected, mTestSolution.reverseBits(n));
    }

    private String replaceMinus(String a) {
        if (a.length() == 32 && a.charAt(0) == '1') {
            return '-' + a.substring(1);
        }
        return a;
    }

}