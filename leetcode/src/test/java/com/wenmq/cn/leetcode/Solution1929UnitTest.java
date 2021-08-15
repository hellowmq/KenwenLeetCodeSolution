package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1929UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1929";


    private Solution1929 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1929();
    }

    @Test
    public void testGetConcatenation_Case1() {
        int[] nums = new int[]{
                1, 2, 1
        };
        int[] expected = new int[]{
                1, 2, 1, 1, 2, 1
        };
        Assert.assertArrayEquals(expected, mTestSolution.getConcatenation(nums));
    }

    @Test
    public void testGetConcatenation_Case2() {
        int[] nums = new int[]{
                1, 3, 2, 1
        };
        int[] expected = new int[]{
                1, 3, 2, 1, 1, 3, 2, 1
        };
        Assert.assertArrayEquals(expected, mTestSolution.getConcatenation(nums));
    }
}