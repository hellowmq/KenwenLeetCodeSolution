package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1791UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1791";


    private Solution1791 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1791();
    }

    @Test
    public void testFindCenter_Case1() {
        int[][] edges = new int[][]{
                {1,2},
                {2,3},
                {4,2},
        };
        int expected = 2;
        assertMoreSolution(edges, expected);
    }

    @Test
    public void testFindCenter_Case2() {
        int[][] edges = new int[][]{
                {1,2},
                {5,1},
                {1,3},
                {1,4},
        };
        int expected = 1;
        assertMoreSolution(edges, expected);
    }

    @Test
    public void testFindCenter_CaseNull() {
        int[][] edges = new int[][]{
        };
        int expected = 0;
        Assert.assertEquals(expected, mTestSolution.findCenter(edges));
    }

    private void assertMoreSolution(int[][] edges, int expected) {
        Assert.assertEquals(expected, mTestSolution.findCenter(edges));
        Assert.assertEquals(expected, mTestSolution.findCenter2(edges));
    }

}