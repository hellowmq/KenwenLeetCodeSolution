package com.wenmq.leetcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1370UnitTest {

    Solution1370 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1370();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSortString_Case1() {
        assertEquals(mTestSolution.sortString("aaaabbbbcccc"), "abccbaabccba");
        assertEquals(mTestSolution.sortString("rat"), "art");
        assertEquals(mTestSolution.sortString("leetcode"), "cdelotee");
        assertEquals(mTestSolution.sortString("ggggggg"), "ggggggg");
        assertEquals(mTestSolution.sortString("spo"), "ops");

    }

}