package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

public class Solution283UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution283";

    private Solution283 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution283();
    }

    @Test
    public void testMoveZeroes_Case1() {
        int[] array = {
                0, 1, 0, 3, 12
        };
        int[] expected = new int[]{
                1, 3, 12, 0, 0
        };
        assertMoreSolution(array, expected);
    }

    @Test
    public void testMoveZeroes_Case2() {
        int[] array = {
                0
        };
        int[] expected = new int[]{
                0
        };
        assertMoreSolution(array, expected);
    }

    @Test
    public void testMoveZeroes_Case3() {
        int[] array = {
                1, 0
        };
        int[] expected = new int[]{
                1, 0
        };
        assertMoreSolution(array, expected);
    }

    @Test
    public void testMoveZeroes_Case4() {
        int[] array = {
        };
        int[] expected = new int[]{
        };
        assertMoreSolution(array, expected);
    }

    private void assertMoreSolution(int[] array, int[] expected) {
        int[] testArray1 = Arrays.copyOf(array, array.length);
        mTestSolution.moveZeroes(testArray1);
        Assert.assertArrayEquals(expected, testArray1);
        int[] testArray2 = Arrays.copyOf(array, array.length);
        mTestSolution.moveZeroes2(testArray2);
        Assert.assertArrayEquals(expected, testArray2);
    }
}