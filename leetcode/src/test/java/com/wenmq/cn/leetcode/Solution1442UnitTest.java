package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class Solution1442UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1442";
    private Solution1442 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1442();
    }

    @Test
    public void testCountTriplets_Case1() {
        int[] array = new int[]{2, 3, 1, 6, 7};
        int expected = 4;
        assertMoreSolution(array, expected);
    }

    @Test
    public void testCountTriplets_Case2() {
        int[] array = new int[]{1, 1, 1, 1, 1};
        int expected = 10;
        assertMoreSolution(array, expected);
    }

    @Test
    public void testCountTriplets_Case3() {
        int[] array = new int[]{2, 3};
        int expected = 0;
        assertMoreSolution(array, expected);
    }

    @Test
    public void testCountTriplets_Case4() {
        int[] array = new int[]{1, 3, 5, 7, 9};
        int expected = 3;
        assertMoreSolution(array, expected);
    }

    @Test
    public void testCountTriplets_Case5() {
        int[] array = new int[]{7, 11, 12, 9, 5, 2, 7, 17, 22};
        int expected = 8;
        assertMoreSolution(array, expected);
    }

    @Test
    public void testCountTriplets_Case6() {
        int[] array = new int[]{1};
        int expected = 0;
        assertMoreSolution(array, expected);
    }

    private void assertMoreSolution(int[] array, int expected) {
        Assert.assertEquals(expected, mTestSolution.countTriplets(array));
        Assert.assertEquals(expected, mTestSolution.countTriplets2(Arrays.copyOf(array, array.length)));
        Assert.assertEquals(expected, mTestSolution.countTriplets3(Arrays.copyOf(array, array.length)));
    }
}