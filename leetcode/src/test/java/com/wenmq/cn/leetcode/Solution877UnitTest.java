package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution877UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution877";
    private Solution877 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution877();
    }

    @Test
    public void testStoneGame_Case() {
        int[] piles = new int[]{
                5, 3, 4, 5
        };
        Assert.assertTrue(mTestSolution.stoneGame(piles));
    }
}