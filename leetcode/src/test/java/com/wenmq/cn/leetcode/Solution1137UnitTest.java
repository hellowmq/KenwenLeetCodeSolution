package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1137UnitTest {

    private Solution1137 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1137();
    }

    @Test
    public void testTribonacci_Case1() {
        int n = 4;
        int expected = 4;
        assertMoreSolution(n, expected);
    }

    @Test
    public void testTribonacci_Case2() {
        int n = 25;
        int expected = 1389537;
        assertMoreSolution(n, expected);
    }

    @Test
    public void testTribonacci_Case3() {
        int n = 0;
        int expected = 0;
        assertMoreSolution(n, expected);
    }

    private void assertMoreSolution(int n, int expected) {
        Assert.assertEquals(expected, mTestSolution.tribonacci(n));
        Assert.assertEquals(expected, mTestSolution.tribonacci2(n));
    }
}