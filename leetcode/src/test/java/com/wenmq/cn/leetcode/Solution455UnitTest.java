package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution455UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution455";


    private Solution455 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution455();
    }

    @Test
    public void testFindContentChildren_Case1() {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        int expected = 1;
        int actual = mTestSolution.findContentChildren(g, s);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindContentChildren_Case2() {
        int[] g = {1, 2};
        int[] s = {1, 2, 3};
        int expected = 2;
        int actual = mTestSolution.findContentChildren(g, s);
        Assert.assertEquals(expected, actual);
    }
}