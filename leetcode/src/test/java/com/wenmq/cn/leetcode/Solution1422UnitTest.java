package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1422UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1422";

    private Solution1422 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1422();
    }

    @Test
    public void testMaxScore_Case1() {
        String s = "011101";
        int expected = 5;
        Assert.assertEquals(expected, mTestSolution.maxScore(s));
    }

    @Test
    public void testMaxScore_Case2() {
        String s = "00111";
        int expected = 5;
        Assert.assertEquals(expected, mTestSolution.maxScore(s));
    }

    @Test
    public void testMaxScore_Case3() {
        String s = "1111";
        int expected = 3;
        Assert.assertEquals(expected, mTestSolution.maxScore(s));
    }
}