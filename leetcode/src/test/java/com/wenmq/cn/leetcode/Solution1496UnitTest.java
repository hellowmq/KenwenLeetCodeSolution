package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1496UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1496";

    private Solution1496 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1496();
    }

    @Test
    public void testIsPathCrossing_Case1() {
        String path = "NES";
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.isPathCrossing(path));
    }

    @Test
    public void testIsPathCrossing_Case2() {
        String path = "NESWW";
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.isPathCrossing(path));
    }

    /**
     * extra case
     */
    @Test
    public void testIsPathCrossing_Case3() {
        String path = "ENESW";
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.isPathCrossing(path));
    }

}