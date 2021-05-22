package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution810UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution810";
    private Solution810 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution810();
    }

    @Test
    public void testXorGame_Case1() {
        int[] nums = new int[]{
                1, 1, 2
        };
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.xorGame(nums));
    }
}