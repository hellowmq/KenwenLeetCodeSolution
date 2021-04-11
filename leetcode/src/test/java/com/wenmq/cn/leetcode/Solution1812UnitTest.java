package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1812UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1812";

    private Solution1812 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1812();
    }

    @Test
    public void testSquareIsWhite_Case1() {
        String a = "a1";
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.squareIsWhite(a));
    }

    @Test
    public void testSquareIsWhite_Case2() {
        String a = "h3";
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.squareIsWhite(a));
    }

    @Test
    public void testSquareIsWhite_Case3() {
        String a = "c7";
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.squareIsWhite(a));
    }
}