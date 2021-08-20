package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class Solution1094UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1094";


    private Solution1094 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1094();
    }

    @Test
    public void testCarPooling_Case1() {
        int[][] trips = new int[][]{
                {2, 1, 5},
                {3, 3, 7},
        };
        int capacity = 4;
        final boolean expected = false;
        assertMoreSolution(trips, capacity, expected);
    }

    @Test
    public void testCarPooling_Case2() {
        int[][] trips = new int[][]{
                {2, 1, 5},
                {3, 3, 7},
        };
        int capacity = 5;
        final boolean expected = true;
        assertMoreSolution(trips, capacity, expected);
    }

    @Test
    public void testCarPooling_Case3() {
        int[][] trips = new int[][]{
                {2, 1, 5},
                {3, 5, 7},
        };
        int capacity = 3;
        final boolean expected = true;
        assertMoreSolution(trips, capacity, expected);
    }

    @Test
    public void testCarPooling_Case4() {
        int[][] trips = new int[][]{
                {3, 2, 7},
                {3, 7, 9},
                {8, 3, 9},
        };
        int capacity = 11;
        final boolean expected = true;
        assertMoreSolution(trips, capacity, expected);
    }

    private void assertMoreSolution(int[][] trips, int capacity, boolean expected) {
        Assert.assertEquals(expected, mTestSolution.carPooling(trips, capacity));
        Assert.assertEquals(expected, mTestSolution.carPooling2(trips, capacity));
    }
}