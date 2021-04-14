package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1732UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1732";

    private Solution1732 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1732();
    }

    @Test
    public void testLargestAltitude_Case1() {
        int[] gain = new int[]{
                -5, 1, 5, 0, -7
        };
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.largestAltitude(gain));
    }

    @Test
    public void testLargestAltitude_Case2() {
        int[] gain = new int[]{
                -4, -3, -2, -1, 4, 3, 2
        };
        int expected = 0;
        Assert.assertEquals(expected, mTestSolution.largestAltitude(gain));
    }
}