package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution414UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution414";

    private Solution414 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution414();
    }

    @Test
    public void testThirdMax_Case1() {
        int[] nums = new int[]{3, 2, 1};
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.thirdMax(nums));
    }

    @Test
    public void testThirdMax_Case2() {
        int[] nums = new int[]{1, 2};
        int expected = 2;
        Assert.assertEquals(expected, mTestSolution.thirdMax(nums));
    }

    @Test
    public void testThirdMax_Case3() {
        int[] nums = new int[]{2, 2, 3, 1};
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.thirdMax(nums));
    }
}