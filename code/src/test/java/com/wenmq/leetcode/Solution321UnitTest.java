package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution321UnitTest {

    private Solution321 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution321();
    }

    @Test
    public void testMaxNumber_Case1() {
        int[] nums1 = {3, 4, 6, 5};
        int[] nums2 = {9, 1, 2, 5, 8, 3};
        int k = 5;
        int[] result = {9, 8, 6, 5, 3};
        Assert.assertArrayEquals(result, mTestSolution.maxNumber(nums1, nums2, k));
    }

    @Test
    public void testMaxNumber_Case2() {
        int[] nums1 = {6, 7};
        int[] nums2 = {6, 0, 4};
        int k = 5;
        int[] result = {6, 7, 6, 0, 4};
        Assert.assertArrayEquals(result, mTestSolution.maxNumber(nums1, nums2, k));
    }

    @Test
    public void testMaxNumber_Case3() {
        int[] nums1 = {3, 9};
        int[] nums2 = {8, 9};
        int k = 3;
        int[] result = {9, 8, 9};
        Assert.assertArrayEquals(result, mTestSolution.maxNumber(nums1, nums2, k));
    }
    @Test
    public void testMaxNumber_Case4() {
        int[] nums1 = {9, 1, 2, 5, 8, 3};
        int[] nums2 = {3, 4, 6, 5};
        int k = 5;
        int[] result = {9, 8, 6, 5, 3};
        Assert.assertArrayEquals(result, mTestSolution.maxNumber(nums1, nums2, k));
    }

}