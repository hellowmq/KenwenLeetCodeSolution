package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1109UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1109";


    private Solution1109 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1109();
    }

    @Test
    public void testCorpFlightBookings_Case1() {
        int[][] bookings = new int[][]{
                {1, 2, 10},
                {2, 3, 20},
                {2, 5, 25}
        };
        int n = 5;
        int[] expected = new int[]{
                10, 55, 45, 25, 25
        };
        assertMoreSolution(bookings, n, expected);
    }

    @Test
    public void testCorpFlightBookings_Case2() {
        int[][] bookings = new int[][]{
                {1, 2, 10},
                {2, 2, 15}
        };
        int n = 2;
        int[] expected = new int[]{
                10, 25
        };
        assertMoreSolution(bookings, n, expected);
    }

    private void assertMoreSolution(int[][] bookings, int n, int[] expected) {
        Assert.assertArrayEquals(expected, mTestSolution.corpFlightBookings(bookings, n));
        Assert.assertArrayEquals(expected, mTestSolution.corpFlightBookings2(bookings, n));
    }
}