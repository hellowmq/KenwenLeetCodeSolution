package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1920UnitTest {

    private Solution1920 mSolution1920;

    @Before
    public void setUp() throws Exception {
        mSolution1920 = new Solution1920();
    }

    @Test
    public void test_BuildArray_Case1() {
        int[] nums = new int[]{
                0, 2, 1, 5, 3, 4
        };
        int[] expecteds = new int[]{
                0, 1, 2, 4, 5, 3
        };
        Assert.assertArrayEquals(expecteds, mSolution1920.buildArray(nums));
    }

    @Test
    public void test_BuildArray_Case2() {
        int[] nums = new int[]{
                5, 0, 1, 2, 3, 4
        };
        int[] expecteds = new int[]{
                4, 5, 0, 1, 2, 3
        };
        Assert.assertArrayEquals(expecteds, mSolution1920.buildArray(nums));
    }
}