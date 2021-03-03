package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution354UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution354";
    private Solution354 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution354();
    }

    @Test
    public void testMaxEnvelopes_Case() {
        int[][] envelopes = new int[][]{{5, 4}, {6, 4}, {6, 7}, {2, 3}};
        final int expect = 3;
        int actual = mTestSolution.maxEnvelopes(envelopes);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testMaxEnvelopes2_Case() {
        int[][] envelopes = new int[][]{{5, 4}, {6, 4}, {6, 7}, {2, 3}};
        final int expect = 3;
        int actual = mTestSolution.maxEnvelopes2(envelopes);
        Assert.assertEquals(expect, actual);
    }


    @Test
    public void testMaxEnvelopes2_CaseNull() {
        int[][] envelopes = new int[][]{};
        final int expect = 0;
        int actual = mTestSolution.maxEnvelopes(envelopes);
        Assert.assertEquals(expect, actual);
        int actual2 = mTestSolution.maxEnvelopes2(envelopes);
        Assert.assertEquals(expect, actual2);
    }
}