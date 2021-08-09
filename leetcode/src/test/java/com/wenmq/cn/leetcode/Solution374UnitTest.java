package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution374UnitTest {

    private Solution374.Solution mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution374.Solution();
    }

    @Test
    public void testGuessNumber_Case1() {
        int n = 10;
        int pick = 6;
        int result = 6;
        mTestSolution.setGuessAble(pick);
        Assert.assertEquals(result, mTestSolution.guessNumber(n));
    }

    @Test
    public void testGuessNumber_Case2() {
        int n = 1;
        int pick = 1;
        int result = 1;
        mTestSolution.setGuessAble(pick);
        Assert.assertEquals(result, mTestSolution.guessNumber(n));
    }

    @Test
    public void testGuessNumber_Case3() {
        int n = 2;
        int pick = 1;
        int result = 1;
        mTestSolution.setGuessAble(pick);
        Assert.assertEquals(result, mTestSolution.guessNumber(n));
    }

    @Test
    public void testGuessNumber_Case4() {
        int n = 2;
        int pick = 2;
        int result = 2;
        mTestSolution.setGuessAble(pick);
        Assert.assertEquals(result, mTestSolution.guessNumber(n));
    }


    @Test
    public void testGuessNumber_CaseERROR() {
        int n = 0;
        int pick = 1;
        int result = 1;
        mTestSolution.setGuessAble(pick);
        Assert.assertEquals(result, mTestSolution.guessNumber(n));
    }
}