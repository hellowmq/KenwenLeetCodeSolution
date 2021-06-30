package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution520UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution520";


    private Solution520 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution520();
    }

    @Test
    public void testDetectCapitalUse_Case1() {
        String word = "USA";
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.detectCapitalUse(word));
    }

    @Test
    public void testDetectCapitalUse_Case2() {
        String word = "FLaG";
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.detectCapitalUse(word));
    }

    @Test
    public void testDetectCapitalUse_Case3() {
        String word = "F";
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.detectCapitalUse(word));
    }
}