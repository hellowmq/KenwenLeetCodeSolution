package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1550UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1550";

    private Solution1550 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1550();
    }

    @Test
    public void testThreeConsecutiveOdds_Case1() {
        int[] arr = new int[]{
                2, 6, 4, 1
        };
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.threeConsecutiveOdds(arr));
    }

    @Test
    public void testThreeConsecutiveOdds_Case2() {
        int[] arr = new int[]{
                1, 2, 34, 3, 4, 5, 7, 23, 12
        };
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.threeConsecutiveOdds(arr));
    }
}