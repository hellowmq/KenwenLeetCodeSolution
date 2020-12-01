package com.wenmq.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution767UnitTest {

    String TAG = "com.wenmq.leetcode.Solution767";
    Solution767 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution767();
    }

    @Test
    public void testReorganizeString_case1() {
        String s = "aab";
        String result = "aba";
        assertEquals(mTestSolution.reorganizeString(s), result);
        assertEquals(mTestSolution.reorganizeString2(s), result);
    }

    @Test
    public void testReorganizeString_case2() {
        String s = "aaab";
        String result = "";
        assertEquals(mTestSolution.reorganizeString(s), result);
        assertEquals(mTestSolution.reorganizeString2(s), result);
    }

    @Test
    public void testReorganizeString_case3() {
        String s = "b";
        String result = "b";
        assertEquals(mTestSolution.reorganizeString(s), result);
        assertEquals(mTestSolution.reorganizeString2(s), result);
    }

    @Test
    public void testReorganizeString_case4() {
        String s = "aabb";
        String result = "abab";
        assertEquals(mTestSolution.reorganizeString(s), result);
        assertEquals(mTestSolution.reorganizeString2(s), result);
    }
}