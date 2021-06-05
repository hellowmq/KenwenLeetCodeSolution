package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1221UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1221";

    private Solution1221 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1221();
    }

    @Test
    public void testBalancedStringSplit_Case1() {
        String s = "RLRRLLRLRL";
        int expected = 4;
        Assert.assertEquals(expected, mTestSolution.balancedStringSplit(s));
    }

    @Test
    public void testBalancedStringSplit_Case2() {
        String s = "RLLLLRRRLR";
        int expected = 3;
        Assert.assertEquals(expected, mTestSolution.balancedStringSplit(s));
    }

    @Test
    public void testBalancedStringSplit_Case3() {
        String s = "LLLLRRRR";
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.balancedStringSplit(s));
    }

    @Test
    public void testBalancedStringSplit_Case4() {
        String s = "RLRRRLLRLL";
        int expected = 2;
        Assert.assertEquals(expected, mTestSolution.balancedStringSplit(s));
    }
}