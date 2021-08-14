package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1945UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1945";


    private Solution1945 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1945();
    }

    @Test
    public void testGetLucky_Case1() {
        String s = "iiii";
        int k = 1;
        int expected = 36;
        Assert.assertEquals(expected, mTestSolution.getLucky(s, k));
    }

    @Test
    public void testGetLucky_Case2() {
        String s = "leetcode";
        int k = 2;
        int expected = 6;
        Assert.assertEquals(expected, mTestSolution.getLucky(s, k));
    }

}