package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution232UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution232";
    private Solution232 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution232();
    }

    @Test
    public void testMyQueue_Case1() {
        Solution232.MyQueue testQueue = new Solution232.MyQueue();
        testQueue.push(1);
        testQueue.push(2);
        final int expectedPeek = 1;
        Assert.assertEquals(expectedPeek, testQueue.peek());
        final int expectedPop = 1;
        Assert.assertEquals(expectedPop, testQueue.pop());
        final boolean expectedEmpty = false;
        Assert.assertEquals(expectedEmpty, testQueue.empty());
    }

    @Test
    public void testMyQueue_Case2() {
        Solution232.MyQueue testQueue = new Solution232.MyQueue();
        testQueue.push(1);
        testQueue.push(2);
        testQueue.pop();
        testQueue.push(3);
        testQueue.pop();
        final boolean expectedEmpty = false;
        Assert.assertEquals(expectedEmpty, testQueue.empty());
    }
}