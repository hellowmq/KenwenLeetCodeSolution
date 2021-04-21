package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1287UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1287";

    private Solution1287 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1287();
    }

    @Test
    public void testFindSpecialInteger_Case1() {
        int[] ints = {
                1, 2, 2, 6, 6, 6, 6, 7, 10
        };
        int expected = 6;
        Assert.assertEquals(expected, mTestSolution.findSpecialInteger(ints));
    }
}