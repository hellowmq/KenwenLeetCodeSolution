package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class Solution80UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution80";

    private Solution80 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution80();
    }

    @Test
    public void testRemoveDuplicates_Case1() {
        int[] array = new int[]{1, 1, 1, 2, 2, 3};
        int newLength = mTestSolution.removeDuplicates(array);

        int[] expected = new int[]{1, 1, 2, 2, 3};
        Assert.assertArrayEquals(expected, Arrays.copyOf(array, newLength));
    }

    @Test
    public void testRemoveDuplicates_Case2() {
        int[] array = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        int newLength = mTestSolution.removeDuplicates(array);

        int[] expected = new int[]{0, 0, 1, 1, 2, 3, 3};
        Assert.assertArrayEquals(expected, Arrays.copyOf(array, newLength));
    }
}