package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution376UnitTest {

    public static final String TAG = "com.wenmq.cn.leetcode.Solution376";

    private Solution376 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution376();
    }

    @Test
    public void testWiggleMaxLength_case1() {
        int[] nums = {1, 7, 4, 9, 2, 5};
        int expected = 6;
        int actual = mTestSolution.wiggleMaxLength(nums);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testWiggleMaxLength_case2() {
        int[] nums = {1, 17, 5, 10, 13, 15, 10, 5, 16, 8};
        int expected = 7;
        int actual = mTestSolution.wiggleMaxLength(nums);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testWiggleMaxLength_case3() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int expected = 2;
        int actual = mTestSolution.wiggleMaxLength(nums);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testWiggleMaxLength_case4() {
        int[] nums = {1};
        int expected = 1;
        int actual = mTestSolution.wiggleMaxLength(nums);
        Assert.assertEquals(expected, actual);
    }
}