package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution283UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution283";

    private Solution283 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution283();
    }

    @Test
    public void testMoveZeroes_Case1() {
        int[] array = {0, 1, 0, 3, 12};
        int[] expected = new int[]{1, 3, 12, 0, 0};
        mTestSolution.moveZeroes(array);
        Assert.assertArrayEquals(expected, array);
    }

    @Test
    public void testMoveZeroes_Case2() {
        int[] array = {0};
        mTestSolution.moveZeroes(array);
        int[] expected = new int[]{0};
        Assert.assertArrayEquals(expected, array);
    }


    @Test
    public void testMoveZeroes_Case3() {
        int[] array = {1, 0};
        mTestSolution.moveZeroes(array);
        int[] expected = new int[]{1, 0};
        Assert.assertArrayEquals(expected, array);
    }

    @Test
    public void testMoveZeroes_Case4() {
        int[] array = {};
        mTestSolution.moveZeroes(array);
        int[] expected = new int[]{};
        Assert.assertArrayEquals(expected, array);
    }
}