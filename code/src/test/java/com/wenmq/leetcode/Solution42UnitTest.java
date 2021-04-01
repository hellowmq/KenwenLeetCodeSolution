package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution42UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution42";

    private Solution42 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution42();
    }

    @Test
    public void testTrap_Case1() {
        int[] array = new int[]{
                0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1
        };
        int expected = 6;
        Assert.assertEquals(expected, mTestSolution.trap(array));
        Assert.assertEquals(expected, mTestSolution.trap2(array));
    }

    @Test
    public void testTrap_Case2() {
        int[] array = new int[]{
                4, 2, 0, 3, 2, 5
        };
        int expected = 9;
        Assert.assertEquals(expected, mTestSolution.trap(array));
        Assert.assertEquals(expected, mTestSolution.trap2(array));
    }
}