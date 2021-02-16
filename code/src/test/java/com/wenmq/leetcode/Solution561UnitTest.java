package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution561UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution561";
    private Solution561 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution561();
    }

    @Test
    public void testArrayPairSum_Case1() {
        int[] array = new int[]{1, 4, 2, 3};
        int expect = 4;
        int actual = mTestSolution.arrayPairSum(array);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testArrayPairSum_Case2() {
        int[] array = new int[]{6, 2, 6, 5, 1, 2};
        int expect = 9;
        int actual = mTestSolution.arrayPairSum(array);
        Assert.assertEquals(expect, actual);
    }
}