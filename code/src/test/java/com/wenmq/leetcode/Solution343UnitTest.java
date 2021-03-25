package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution343UnitTest {

    String TAG = "com.wenmq.leetcode.Solution343";
    private Solution343 mTestSolutoin;


    @Before
    public void setUp() throws Exception {
        mTestSolutoin = new Solution343();
    }

    @Test
    public void testIntegerBreak_case1() {
        int n = 2;
        int expected = 1;
        Assert.assertEquals(expected, mTestSolutoin.integerBreak(n));
        Assert.assertEquals(expected, mTestSolutoin.integerBreak2(n));

    }

    @Test
    public void testIntegerBreak_case2() {
        int n = 8;
        int expected = 18;
        Assert.assertEquals(expected, mTestSolutoin.integerBreak(n));
        Assert.assertEquals(expected, mTestSolutoin.integerBreak2(n));
    }

    @Test
    public void testIntegerBreak_case3() {
        int n = 9;
        int expected = 27;
        Assert.assertEquals(expected, mTestSolutoin.integerBreak(n));
        Assert.assertEquals(expected, mTestSolutoin.integerBreak2(n));
    }

    @Test
    public void testIntegerBreak_case4() {
        int n = 10;
        int expected = 36;
        Assert.assertEquals(expected, mTestSolutoin.integerBreak(n));
        Assert.assertEquals(expected, mTestSolutoin.integerBreak2(n));
    }

}