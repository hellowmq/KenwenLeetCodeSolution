package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.wenmq.cn.tools.ArrayTools;

public class Solution354UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution354";
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
        assertMoreSolution(envelopes, expect);
    }

    @Test
    public void testMaxEnvelopes_Case3() {
        int[][] envelopes = new int[][]{
                {5, 4}, {6, 4}, {2, 3}, {6, 1}
        };
        final int expect = 2;
        assertMoreSolution(envelopes, expect);
    }

    @Test
    public void testMaxEnvelopes_Case2() {
        int[][] envelopes = new int[][]{
                {1, 1}, {1, 1}, {1, 1},
        };
        final int expect = 1;
        assertMoreSolution(envelopes, expect);
    }

    @Test
    public void testMaxEnvelopes2_CaseNull() {
        int[][] envelopes = new int[][]{};
        final int expect = 0;
        assertMoreSolution(envelopes, expect);
    }

    private void assertMoreSolution(int[][] envelopes, int expect) {
        Assert.assertEquals(expect, mTestSolution.maxEnvelopes(ArrayTools.copyOfMatrix(envelopes)));
        Assert.assertEquals(expect, mTestSolution.maxEnvelopes2(ArrayTools.copyOfMatrix(envelopes)));
    }
}