package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1217UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1217";

    private Solution1217 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1217();
    }

    @Test
    public void testMinCostToMoveChips_Case1() {
        int[] position = new int[]{
                1, 2, 3
        };
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.minCostToMoveChips(position));
    }

    @Test
    public void testMinCostToMoveChips_Case2() {
        int[] position = new int[]{
                2, 2, 2, 3, 3
        };
        int expected = 2;
        Assert.assertEquals(expected, mTestSolution.minCostToMoveChips(position));
    }
}