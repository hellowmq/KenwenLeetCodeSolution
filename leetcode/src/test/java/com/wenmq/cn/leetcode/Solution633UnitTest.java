package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution633UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution633";

    private Solution633 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution633();
    }

    @Test
    public void testJudgeSquareSum_Case1() {
        int c = 5;
        final boolean expected = true;
        assertMoreSolution(c, expected);
    }

    @Test
    public void testJudgeSquareSum_Case2() {
        int c = 3;
        final boolean expected = false;
        assertMoreSolution(c, expected);
    }

    @Test
    public void testJudgeSquareSum_Case3() {
        int c = 4;
        final boolean expected = true;
        assertMoreSolution(c, expected);
    }

    @Test
    public void testJudgeSquareSum_Case4() {
        int c = 2;
        final boolean expected = true;
        assertMoreSolution(c, expected);
    }

    @Test
    public void testJudgeSquareSum_Case5() {
        int c = 1;
        final boolean expected = true;
        assertMoreSolution(c, expected);
    }

    @Test
    public void testJudgeSquareSum_Case6() {
        int c = 149;
        final boolean expected = true;
        assertMoreSolution(c, expected);
    }

    private void assertMoreSolution(int c, boolean expected) {
        Assert.assertEquals(expected, mTestSolution.judgeSquareSum(c));
        Assert.assertEquals(expected, mTestSolution.judgeSquareSum2(c));
    }
}