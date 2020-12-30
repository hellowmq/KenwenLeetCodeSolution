package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1046UnitTest {

    String TAG = "com.wenmq.leetcode.Solution1046";
    private Solution1046 mSolution;


    @Before
    public void setUp() throws Exception {
        mSolution = new Solution1046();
    }

    @Test
    public void testLastStoneWeight_() {
        int[] stones = new int[]{2, 7, 4, 1, 8, 1};
        int expected = 1;
        int actual = mSolution.lastStoneWeight(stones);
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testLastStoneWeight2_() {
        int[] stones = new int[]{2, 7, 4, 1, 8, 1};
        int expected = 1;
        int actual = mSolution.lastStoneWeight2(stones);
        Assert.assertEquals(expected, actual);
    }
}