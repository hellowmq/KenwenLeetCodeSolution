package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class Solution1089UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1089";


    private Solution1089 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1089();
    }

    @Test
    public void testDuplicateZeros_Case1() {
        int[] arr = new int[]{
                1, 0, 2, 3, 0, 4, 5, 0
        };
        int[] expected = new int[]{
                1, 0, 0, 2, 3, 0, 0, 4
        };
        assertMoreSolution(arr, expected);
    }

    @Test
    public void testDuplicateZeros_Case2() {
        int[] arr = new int[]{
                1, 2, 3
        };
        int[] expected = new int[]{
                1, 2, 3
        };
        assertMoreSolution(arr, expected);
    }

    private void assertMoreSolution(int[] arr, int[] expected) {
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        mTestSolution.duplicateZeros(arr1);
        Assert.assertArrayEquals(expected, arr1);
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        mTestSolution.duplicateZeros2(arr2);
        Assert.assertArrayEquals(expected, arr2);
    }
}