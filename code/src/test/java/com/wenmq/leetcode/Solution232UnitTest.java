package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution232UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution232";
    private Solution232.MyQueue mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution232.MyQueue();
    }

    @Test
    public void testMyQueue_Case1() {
        mTestSolution.push(1);
        mTestSolution.push(2);
        final int expectedPeek = 1;
        Assert.assertEquals(expectedPeek, mTestSolution.peek());
        final int expectedPop = 1;
        Assert.assertEquals(expectedPop, mTestSolution.pop());
        final boolean expectedEmpty = false;
        Assert.assertEquals(expectedEmpty, mTestSolution.empty());
    }
}