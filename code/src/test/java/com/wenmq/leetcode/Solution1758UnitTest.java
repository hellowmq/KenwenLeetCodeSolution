package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1758UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution1758";
    private Solution1758 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1758();
    }

    @Test
    public void testMinOperations_Case1() {
        String s = "0100";
        int actual = mTestSolution.minOperations(s);
        int expect = 1;
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testMinOperations_Case2() {
        String s = "10";
        int actual = mTestSolution.minOperations(s);
        int expect = 0;
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testMinOperations_Case3() {
        String s = "1111";
        int actual = mTestSolution.minOperations(s);
        int expect = 2;
        Assert.assertEquals(expect, actual);
    }
}