package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution150UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution150";
    private Solution150 mSolution150;


    @Before
    public void setUp() throws Exception {
        mSolution150 = new Solution150();
    }

    @Test
    public void testEvalRPN_Case1() {
        String[] tokens = new String[]{
                "2", "1", "+", "3", "*"
        };
        int actual = mSolution150.evalRPN(tokens);
        int expected = 9;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEvalRPN_Case2() {
        String[] tokens = new String[]{
                "4", "13", "5", "/", "+"
        };
        int actual = mSolution150.evalRPN(tokens);
        int expected = 6;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEvalRPN_Case3() {
        String[] tokens = new String[]{
                "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"
        };
        int actual = mSolution150.evalRPN(tokens);
        int expected = 22;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEvalRPN_Case4() {
        String[] tokens = new String[]{
                "2", "1", "-"
        };
        int actual = mSolution150.evalRPN(tokens);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }
}