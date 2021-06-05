package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution474UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution474";

    private Solution474 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution474();
    }

    @Test
    public void testFindMaxForm_Case1() {
        String[] strs = new String[]{
                "10", "0001", "111001", "1", "0"
        };
        int m = 5;
        int n = 3;
        int expected = 4;
        Assert.assertEquals(expected, mTestSolution.findMaxForm(strs, m, n));
    }

    @Test
    public void testFindMaxForm_Case2() {
        String[] strs = new String[]{
                "10", "0", "1"
        };
        int m = 1;
        int n = 1;
        int expected = 2;
        Assert.assertEquals(expected, mTestSolution.findMaxForm(strs, m, n));
    }
}