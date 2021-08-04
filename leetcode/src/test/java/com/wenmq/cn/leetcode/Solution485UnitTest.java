package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution485UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution485";


    private Solution485 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution485();
    }

    @Test
    public void testFindMaxConsecutiveOnes_Case1() {
        int[] nums = new int[]{
                1, 1, 0, 1, 1, 1
        };
        int expected = 3;
        Assert.assertEquals(expected, mTestSolution.findMaxConsecutiveOnes(nums));
    }
}