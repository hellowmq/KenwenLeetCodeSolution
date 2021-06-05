package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1437UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1437";

    private Solution1437 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1437();
    }

    @Test
    public void testKLengthApart_Case1() {
        int[] nums = new int[]{
                1, 0, 0, 0, 1, 0, 0, 1
        };
        int k = 2;
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.kLengthApart(nums, k));
    }

    @Test
    public void testKLengthApart_Case2() {
        int[] nums = new int[]{
                1, 0, 0, 1, 0, 1
        };
        int k = 2;
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.kLengthApart(nums, k));
    }

    @Test
    public void testKLengthApart_Case3() {
        int[] nums = new int[]{
                1, 1, 1, 1, 1
        };
        int k = 0;
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.kLengthApart(nums, k));
    }

    @Test
    public void testKLengthApart_Case4() {
        int[] nums = new int[]{
                0, 1, 0, 1
        };
        int k = 1;
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.kLengthApart(nums, k));
    }
}