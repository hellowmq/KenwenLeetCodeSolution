package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1822UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1822";

    private Solution1822 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1822();
    }

    @Test
    public void testArraySign_Case1() {
        int[] nums = new int[]{
                -1, -2, -3, -4, 3, 2, 1
        };
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.arraySign(nums));
    }

    @Test
    public void testArraySign_Case2() {
        int[] nums = new int[]{
                1, 5, 0, 2, -3
        };
        int expected = 0;
        Assert.assertEquals(expected, mTestSolution.arraySign(nums));
    }

    @Test
    public void testArraySign_Case3() {
        int[] nums = new int[]{
                -1, 1, -1, 1, -1
        };
        int expected = -1;
        Assert.assertEquals(expected, mTestSolution.arraySign(nums));
    }
}