package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution153UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution153";

    private Solution153 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution153();
    }

    @Test
    public void testFindMin_Case1() {
        int[] nums = new int[]{
                3, 4, 5, 1, 2
        };
        int expected = 1;
        int expectedMax = 5;

        Assert.assertEquals(expected, mTestSolution.findMin(nums));
    }

    @Test
    public void testFindMin_Case2() {
        int[] nums = new int[]{
                4, 5, 6, 7, 0, 1, 2
        };
        int expected = 0;
        int expectedMax = 7;

        Assert.assertEquals(expected, mTestSolution.findMin(nums));
    }

    @Test
    public void testFindMin_Case3() {
        int[] nums = new int[]{
                11, 13, 15, 17
        };
        int expected = 11;
        int expectedMax = 17;

        Assert.assertEquals(expected, mTestSolution.findMin(nums));
    }

    @Test
    public void testFindMin_Case4() {
        int[] nums = new int[]{
                3, 1, 2
        };
        int expected = 1;
        int expectedMax = 3;

        Assert.assertEquals(expected, mTestSolution.findMin(nums));
    }

}