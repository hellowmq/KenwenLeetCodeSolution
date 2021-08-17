package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1913UnitTest {

    private Solution1913 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1913();
    }

    @Test
    public void testMaxProductDifference_Case1() {
        int[] nums = new int[]{
                5, 6, 2, 7, 4
        };
        int expected = 34;
        Assert.assertEquals(expected, mTestSolution.maxProductDifference(nums));
    }

    @Test
    public void testMaxProductDifference_Case2() {
        int[] nums = new int[]{
                4, 2, 5, 9, 7, 4, 8
        };
        int expected = 64;
        Assert.assertEquals(expected, mTestSolution.maxProductDifference(nums));
    }
}