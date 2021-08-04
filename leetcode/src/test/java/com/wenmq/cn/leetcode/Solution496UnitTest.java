package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution496UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution496";


    private Solution496 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution496();
    }

    @Test
    public void testNextGreaterElement_Case1() {
        int[] nums1 = new int[]{
                4, 1, 2,
        };
        int[] nums2 = new int[]{
                1, 3, 4, 2,
        };
        int[] expected = new int[]{
                -1, 3, -1
        };
        assertMoreSolution(nums1, nums2, expected);
    }

    @Test
    public void testNextGreaterElement_Case2() {
        int[] nums1 = new int[]{
                2, 4,
        };
        int[] nums2 = new int[]{
                1, 2, 3, 4,
        };
        int[] expected = new int[]{
                3, -1
        };
        assertMoreSolution(nums1, nums2, expected);
    }

    private void assertMoreSolution(int[] nums1, int[] nums2, int[] expected) {
        Assert.assertArrayEquals(expected, mTestSolution.nextGreaterElement(nums1, nums2));
        Assert.assertArrayEquals(expected, mTestSolution.nextGreaterElement2(nums1, nums2));
    }
}