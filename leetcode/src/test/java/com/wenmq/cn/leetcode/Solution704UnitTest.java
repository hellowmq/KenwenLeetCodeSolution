package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution704UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution704";


    private Solution704 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution704();
    }

    @Test
    public void testSearch_Case1() {
        int[] nums = new int[]{
                -1, 0, 3, 5, 9, 12
        };
        int target = 9;
        int expected = 4;
        Assert.assertEquals(expected, mTestSolution.search(nums, target));
    }

    @Test
    public void testSearch_Case2() {
        int[] nums = new int[]{
                -1,0,3,5,9,12
        };
        int target = 2;
        int expected = -1;
        Assert.assertEquals(expected, mTestSolution.search(nums, target));
    }
}