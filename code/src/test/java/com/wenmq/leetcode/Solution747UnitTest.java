package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution747UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution747";
    private Solution747 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution747();
    }

    @Test
    public void testDominantIndex_Case1() {
        int[] array = new int[]{3, 6, 1, 0};
        int actual = mTestSolution.dominantIndex(array);
        final int expect = 1;
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testDominantIndex_Case2() {
        int[] array = new int[]{1, 2, 3, 4};
        int actual = mTestSolution.dominantIndex(array);
        final int expect = -1;
        Assert.assertEquals(expect, actual);
    }
}