package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1614UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1614";

    private Solution1614 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1614();
    }

    @Test
    public void testMaxDepth_Case1() {
        String s = "(1+(2*3)+((8)/4))+1";
        int expected = 3;
        Assert.assertEquals(expected, mTestSolution.maxDepth(s));
    }

    @Test
    public void testMaxDepth_Case2() {
        String s = "(1)+((2))+(((3)))";
        int expected = 3;
        Assert.assertEquals(expected, mTestSolution.maxDepth(s));
    }

    @Test
    public void testMaxDepth_Case3() {
        String s = "1+(2*3)/(2-1)";
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.maxDepth(s));
    }

    @Test
    public void testMaxDepth_Case4() {
        String s = "1";
        int expected = 0;
        Assert.assertEquals(expected, mTestSolution.maxDepth(s));
    }
}