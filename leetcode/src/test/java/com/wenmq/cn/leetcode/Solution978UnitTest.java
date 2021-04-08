package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution978UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution978";
    private Solution978 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution978();
    }


    @Test
    public void testMaxTurbulenceSize_Case1() {
        int[] array = new int[]{9, 4, 2, 10, 7, 8, 8, 1, 9};
        int expect = 5;
        int actual = mTestSolution.maxTurbulenceSize(array);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testMaxTurbulenceSize_Case2() {
        int[] array = new int[]{4, 8, 12, 16};
        int expect = 2;
        int actual = mTestSolution.maxTurbulenceSize(array);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testMaxTurbulenceSize_Case3() {
        int[] array = new int[]{100};
        int expect = 1;
        int actual = mTestSolution.maxTurbulenceSize(array);
        Assert.assertEquals(expect, actual);
    }
}