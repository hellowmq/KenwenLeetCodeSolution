package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
        final int expect = 1;
        Assert.assertEquals(expect, mTestSolution.dominantIndex(array));
    }

    @Test
    public void testDominantIndex_Case2() {
        int[] array = new int[]{1, 2, 3, 4};
        final int expect = -1;
        Assert.assertEquals(expect, mTestSolution.dominantIndex(array));
    }

    @Test
    public void testDominantIndex_Case3() {
        int[] array = new int[]{1, 4, 2};
        final int expect = 1;
        Assert.assertEquals(expect, mTestSolution.dominantIndex(array));
    }

    @Test
    public void testDominantIndex_Case4() {
        int[] array = new int[]{1};
        final int expect = 0;
        Assert.assertEquals(expect, mTestSolution.dominantIndex(array));
    }
}