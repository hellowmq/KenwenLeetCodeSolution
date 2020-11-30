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
        TimeUtils.getInstance("reorganizeString").start();
        assertEquals(mTestSolution.reorganizeString("aab"), "aba");
        TimeUtils.getInstance("reorganizeString").end();
        TimeUtils.getInstance("reorganizeString2").start();

        assertEquals(mTestSolution.reorganizeString2("aab"), "aba");
        TimeUtils.getInstance("reorganizeString2").end();

    }

    @Test
    public void testReorganizeString_case2() {
        assertEquals(mTestSolution.reorganizeString("aaab"), "");
        assertEquals(mTestSolution.reorganizeString2("aaab"), "");
    }
}