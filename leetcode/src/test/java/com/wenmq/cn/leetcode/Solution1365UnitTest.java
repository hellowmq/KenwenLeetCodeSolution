package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1365UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1365";

    private Solution1365 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1365();
    }

    @Test
    public void testSmallerNumbersThanCurrent_Case1() {
        int[] nums = new int[]{
                8, 1, 2, 2, 3
        };
        int[] expected = {
                4, 0, 1, 1, 3
        };
        Assert.assertArrayEquals(expected, mTestSolution.smallerNumbersThanCurrent(nums));
    }

    @Test
    public void testSmallerNumbersThanCurrent_Case2() {
        int[] nums = new int[]{
                6, 5, 4, 8
        };
        int[] expected = {
                2, 1, 0, 3
        };
        Assert.assertArrayEquals(expected, mTestSolution.smallerNumbersThanCurrent(nums));
    }

    @Test
    public void testSmallerNumbersThanCurrent_Case3() {
        int[] nums = new int[]{
                7, 7, 7, 7
        };
        int[] expected = {
                0, 0, 0, 0
        };
        Assert.assertArrayEquals(expected, mTestSolution.smallerNumbersThanCurrent(nums));
    }
}