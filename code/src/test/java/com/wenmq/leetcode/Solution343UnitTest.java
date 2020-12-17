package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution343UnitTest {

    String TAG = "com.wenmq.leetcode.Solution343";
    private Solution343 mTestSolutoin;


    @Before
    public void setUp() throws Exception {
        mTestSolutoin = new Solution343();
    }

    @Test
    public void testIntegerBreak_case1() {
        int expected = 1;
        Assert.assertEquals(expected, mTestSolutoin.integerBreak(2));
        Assert.assertEquals(expected, mTestSolutoin.integerBreak2(2));

    }

    @Test
    public void testIntegerBreak_case2() {
        int expected = 36;
        Assert.assertEquals(expected, mTestSolutoin.integerBreak(10));
        Assert.assertEquals(expected, mTestSolutoin.integerBreak2(10));

    }
}