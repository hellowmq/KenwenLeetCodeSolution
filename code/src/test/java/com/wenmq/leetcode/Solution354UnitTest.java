package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.wenmq.tools.ArrayTools.copyOfMatrix;

public class Solution354UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution354";
    private Solution354 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution354();
    }

    @Test
    public void testMaxEnvelopes_Case1() {
        int[][] envelopes = new int[][]{
                {5, 4}, {6, 4}, {6, 7}, {2, 3}
        };
        final int expect = 3;
        Assert.assertEquals(expect, mTestSolution.maxEnvelopes(copyOfMatrix(envelopes)));
        Assert.assertEquals(expect, mTestSolution.maxEnvelopes2(copyOfMatrix(envelopes)));
    }

    @Test
    public void testMaxEnvelopes2_CaseNull() {
        int[][] envelopes = new int[][]{};
        final int expect = 0;
        Assert.assertEquals(expect, mTestSolution.maxEnvelopes(copyOfMatrix(envelopes)));
        Assert.assertEquals(expect, mTestSolution.maxEnvelopes2(copyOfMatrix(envelopes)));
    }
}