package com.wenmq.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1525UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution1525";
    private Solution1525 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1525();
    }

    @Test
    public void testNumSplits_Case1() {
        String s = "aacaba";
        int expected = 2;
        assertEquals(expected, mTestSolution.numSplits(s));
        assertEquals(expected, mTestSolution.numSplits2(s));
    }

    @Test
    public void testNumSplits_Case2() {
        String s = "abcd";
        int expected = 1;
        assertEquals(expected, mTestSolution.numSplits(s));
        assertEquals(expected, mTestSolution.numSplits2(s));
    }

    @Test
    public void testNumSplits_Case3() {
        String s = "aaaaa";
        int expected = 4;
        assertEquals(expected, mTestSolution.numSplits(s));
        assertEquals(expected, mTestSolution.numSplits2(s));
    }

    @Test
    public void testNumSplits_Case4() {
        String s = "acbadbaada";
        int expected = 2;
        assertEquals(expected, mTestSolution.numSplits(s));
        assertEquals(expected, mTestSolution.numSplits2(s));
    }


}