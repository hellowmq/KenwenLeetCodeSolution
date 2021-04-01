package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class Solution1046UnitTest {

    public static final String TAG = "com.wenmq.leetcode.Solution1046";
    private Solution1046 mSolution;


    @Before
    public void setUp() throws Exception {
        mSolution = new Solution1046();
    }

    @Test
    public void testLastStoneWeight_() {
        int[] stones = new int[]{2, 7, 4, 1, 8, 1};
        int expected = 1;
        Assert.assertEquals(expected, mSolution.lastStoneWeight(Arrays.copyOf(stones, stones.length)));
        Assert.assertEquals(expected, mSolution.lastStoneWeight2(Arrays.copyOf(stones, stones.length)));
    }

    @Test
    public void testLastStoneWeight_Case2() {
        int[] stones = new int[]{2};
        int expected = 2;
        Assert.assertEquals(expected, mSolution.lastStoneWeight(Arrays.copyOf(stones, stones.length)));
        Assert.assertEquals(expected, mSolution.lastStoneWeight2(Arrays.copyOf(stones, stones.length)));
    }
}