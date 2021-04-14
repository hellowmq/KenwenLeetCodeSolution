package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1716UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1716";

    private Solution1716 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1716();
    }

    @Test
    public void testTotalMoney_Case1() {
        int n = 4;
        int expected = 10;
        assertMoreSolution(n, expected);
    }

    @Test
    public void testTotalMoney_Case2() {
        int n = 10;
        int expected = 37;
        assertMoreSolution(n, expected);
    }

    @Test
    public void testTotalMoney_Case3() {
        int n = 20;
        int expected = 96;
        assertMoreSolution(n, expected);
    }

    private void assertMoreSolution(int n, int expected) {
        Assert.assertEquals(expected, mTestSolution.totalMoney(n));
        Assert.assertEquals(expected, mTestSolution.totalMoney2(n));
    }
}