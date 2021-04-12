package com.wenmq.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1742UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1742";

    private Solution1742 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1742();
    }

    @Test
    public void testCountBalls_Case1() {
        int low = 1;
        int high = 10;
        int expected = 2;
        assertMoreSolution(low, high, expected);
    }

    @Test
    public void testCountBalls_Case2() {
        int low = 5;
        int high = 15;
        int expected = 2;
        assertMoreSolution(low, high, expected);
    }

    @Test
    public void testCountBalls_Case3() {
        int low = 19;
        int high = 28;
        int expected = 2;
        assertMoreSolution(low, high, expected);
    }

    /**
     * 这个 Case 会导致方法二的时间膨胀
     */
    @Test
    public void testCountBalls_Case4() {
        int low = 1;
        int high = 99999;
        int expected = 6000;
        assertMoreSolution(low, high, expected);
    }


    private void assertMoreSolution(int low, int high, int expected) {
        assertEquals(expected, mTestSolution.countBalls(low, high));
        assertEquals(expected, mTestSolution.countBalls2(low, high));
    }
}