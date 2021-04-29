package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1446UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1446";

    private Solution1446 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1446();
    }

    @Test
    public void testMaxPower_Case1() {
        String s = "leetcode";
        int expected = 2;
        Assert.assertEquals(expected, mTestSolution.maxPower(s));
    }

    @Test
    public void testMaxPower_Case2() {
        String s = "abbcccddddeeeeedcba";
        int expected = 5;
        Assert.assertEquals(expected, mTestSolution.maxPower(s));
    }

    @Test
    public void testMaxPower_Case3() {
        String s = "triplepillooooow";
        int expected = 5;
        Assert.assertEquals(expected, mTestSolution.maxPower(s));
    }

    @Test
    public void testMaxPower_Case4() {
        String s = "hooraaaaaaaaaaay";
        int expected = 11;
        Assert.assertEquals(expected, mTestSolution.maxPower(s));
    }

    @Test
    public void testMaxPower_Case5() {
        String s = "tourist";
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.maxPower(s));
    }
}