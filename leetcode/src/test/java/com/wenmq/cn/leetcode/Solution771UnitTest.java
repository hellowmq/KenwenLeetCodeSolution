package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution771UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution771";
    private Solution771 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution771();
    }

    @Test
    public void testNumJewelsInStones_Case1() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int expected = 3;
        assertMoreSolution(jewels, stones, expected);
    }

    @Test
    public void testNumJewelsInStones_Case2() {
        String jewels = "z";
        String stones = "ZZ";
        int expected = 0;
        assertMoreSolution(jewels, stones, expected);
    }

    public void assertMoreSolution(String jewels, String stones, int expected) {
        Assert.assertEquals(expected, mTestSolution.numJewelsInStones(jewels, stones));
        Assert.assertEquals(expected, mTestSolution.numJewelsInStones2(jewels, stones));
    }
}