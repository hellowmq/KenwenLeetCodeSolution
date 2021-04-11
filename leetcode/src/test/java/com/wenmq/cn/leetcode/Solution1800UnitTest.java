package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1800UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1800";

    private Solution1800 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1800();
    }

    @Test
    public void testMaxAscendingSum_Case1() {
        int[] nums = new int[]{
                10, 20, 30, 5, 10, 50
        };
        Assert.assertEquals(65, mTestSolution.maxAscendingSum(nums));
    }

    @Test
    public void testMaxAscendingSum_Case2() {
        int[] nums = new int[]{
                10, 20, 30, 40, 50
        };
        Assert.assertEquals(150, mTestSolution.maxAscendingSum(nums));
    }

    @Test
    public void testMaxAscendingSum_Case3() {
        int[] nums = new int[]{
                12, 17, 15, 13, 10, 11, 12
        };
        Assert.assertEquals(33, mTestSolution.maxAscendingSum(nums));
    }

    @Test
    public void testMaxAscendingSum_Case4() {
        int[] nums = new int[]{
                100, 10, 1
        };
        Assert.assertEquals(100, mTestSolution.maxAscendingSum(nums));
    }
}