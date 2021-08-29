package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution567UnitTest {

    private Solution567 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution567();
    }

    @Test
    public void test_CheckInclusion_Case1() {
        String s1 = "ab";
        String s2 = "eidbaooo";
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.checkInclusion(s1, s2));
    }
    @Test
    public void test_CheckInclusion_Case2() {
        String s1 = "ab";
        String s2 = "eidboaoo";
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.checkInclusion(s1, s2));
    }
}