package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class Solution26UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution26";

    private Solution26 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution26();
    }

    @Test
    public void testRemoveDuplicates_Case1() {
        int[] nums = {
                1, 1, 2
        };
        int[] expected = {
                1, 2
        };
        int expectedLen = 2;
        assertMoreSolution(nums, expected, expectedLen);
    }

    @Test
    public void testRemoveDuplicates_Case2() {
        int[] nums = {
                0, 0, 1, 1, 1, 2, 2, 3, 3, 4
        };
        int[] expected = {
                0, 1, 2, 3, 4
        };
        int expectedLen = 5;
        assertMoreSolution(nums, expected, expectedLen);
    }

    @Test
    public void testRemoveDuplicates_Case3() {
        int[] nums = {
        };
        int[] expected = {
        };
        int expectedLen = 0;
        assertMoreSolution(nums, expected, expectedLen);
    }


    private void assertMoreSolution(int[] nums, int[] expected, int expectedLen) {
        int[] sourceArray1 = Arrays.copyOf(nums, nums.length);
        int actual = mTestSolution.removeDuplicates(sourceArray1);
        Assert.assertEquals(expectedLen, actual);
        Assert.assertArrayEquals(expected, Arrays.copyOf(sourceArray1, actual));
        // solution2
        int[] sourceArray2 = Arrays.copyOf(nums, nums.length);
        int actual2 = mTestSolution.removeDuplicates2(sourceArray2);
        Assert.assertEquals(expectedLen, actual2);
        Assert.assertArrayEquals(expected, Arrays.copyOf(sourceArray2, actual2));
    }
}