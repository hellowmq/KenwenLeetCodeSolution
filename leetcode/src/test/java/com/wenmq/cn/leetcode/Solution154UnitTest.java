package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution154UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution154";

    private Solution154 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution154();
    }

    @Test
    public void testFindMin_Case() {
        int[] nums = new int[]{1, 3, 5};
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.findMin(nums));
    }

    @Test
    public void testFindMin_Case2() {
        int[] nums = new int[]{2, 2, 2, 0, 1};
        int expected = 0;
        Assert.assertEquals(expected, mTestSolution.findMin(nums));
    }

    @Test
    public void testFindMin_Case3() {
        int[] nums = new int[]{2, 2, 2, 0, 0, 1};
        int expected = 0;
        Assert.assertEquals(expected, mTestSolution.findMin(nums));
    }
}