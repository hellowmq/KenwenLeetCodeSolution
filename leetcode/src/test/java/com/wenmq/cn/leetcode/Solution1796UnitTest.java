package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1796UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1796";

    private Solution1796 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1796();
    }

    @Test
    public void testSecondHighest_Case1() {
        String s = "dfa12321afd";
        int expected = 2;
        Assert.assertEquals(expected, mTestSolution.secondHighest(s));
        Assert.assertEquals(expected, mTestSolution.secondHighest2(s));
    }

    @Test
    public void testSecondHighest_Case2() {
        String s = "abc1111";
        int expected = -1;
        Assert.assertEquals(expected, mTestSolution.secondHighest(s));
        Assert.assertEquals(expected, mTestSolution.secondHighest2(s));
    }

    @Test
    public void testSecondHighest_Case3() {
        String s = "abc";
        int expected = -1;
        Assert.assertEquals(expected, mTestSolution.secondHighest(s));
        Assert.assertEquals(expected, mTestSolution.secondHighest2(s));
    }
}