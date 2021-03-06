package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class Solution48UnitTest {

    public static final String TAG = "com.wenmq.cn.leetcode.Solution48";
    private Solution48 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution48();

    }

    @Test
    public void testRotate_case1() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expect = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        mTestSolution.rotate(matrix);
        Assert.assertArrayEquals(expect, matrix);

    }

    @Test
    public void testRotate_case2() {
        int[][] matrix = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };

        int[][] expect = {
                {15, 13, 2, 5},
                {14, 3, 4, 1},
                {12, 6, 8, 9},
                {16, 7, 10, 11}
        };
        mTestSolution.rotate(matrix);
        Assert.assertArrayEquals(expect, matrix);
    }


    @Test
    public void testRotate2_case1() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expect = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        mTestSolution.rotate2(matrix);
        Assert.assertArrayEquals(expect, matrix);

    }

    @Test
    public void testRotate2_case2() {
        int[][] matrix = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };

        int[][] expect = {
                {15, 13, 2, 5},
                {14, 3, 4, 1},
                {12, 6, 8, 9},
                {16, 7, 10, 11}
        };
        mTestSolution.rotate2(matrix);
        Assert.assertArrayEquals(expect, matrix);
    }


    @Test
    public void testReverse_Case1() {
        int[] nums = new int[]{
                1, 2, 3
        };
        int[] copy = Arrays.copyOf(nums, nums.length);
        Solution48.reverse(copy, -1, 0);
        Assert.assertArrayEquals(nums, copy);
    }

    @Test
    public void testReverse_Case2() {
        int[] nums = new int[]{
                1, 2, 3
        };
        int[] copy = Arrays.copyOf(nums, nums.length);
        Solution48.reverse(copy, 0, nums.length);
        Assert.assertArrayEquals(nums, copy);
    }
}