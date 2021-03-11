package com.wenmq.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution137UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution137";
    private Solution137 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution137();
    }

    @Test
    public void testSingleNumber_Case1() {
        int[] array = new int[]{2, 2, 3, 2};
        int actual = mTestSolution.singleNumber(array);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void testSingleNumber_Case2() {
        int[] array = new int[]{0, 1, 0, 1, 0, 1, 99};
        int actual = mTestSolution.singleNumber(array);
        int expected = 99;
        assertEquals(expected, actual);
    }
}