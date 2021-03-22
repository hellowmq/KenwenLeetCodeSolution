package com.wenmq.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution191UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution191";
    private Solution191 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution191();
    }

    @Test
    public void testHammingWeight_Case1() {
        int n = 0b00000000000000000000000000001011;
        int expected = 3;
        assertEquals(expected, mTestSolution.hammingWeight(n));
        assertEquals(expected, mTestSolution.hammingWeight2(n));
    }

    @Test
    public void testHammingWeight_Case2() {
        int n = 0b00000000000000000000000010000000;
        int expected = 1;
        assertEquals(expected, mTestSolution.hammingWeight(n));
    }

    @Test
    public void testHammingWeight_Case3() {
        int n = 0b11111111111111111111111111111101;
        int expected = 31;
        assertEquals(expected, mTestSolution.hammingWeight(n));
    }
}