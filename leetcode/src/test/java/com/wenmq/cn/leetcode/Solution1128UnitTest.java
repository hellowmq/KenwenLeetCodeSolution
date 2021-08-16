package com.wenmq.cn.leetcode;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1128UnitTest {

    private Solution1128 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1128();
    }

    @Test
    public void numEquivDominoPairs_Case1() {
        int[][] dominoes = {
                {1, 2},
                {2, 1},
                {3, 4},
                {5, 6},
        };
        int expected = 1;
        assertMoreSolution(dominoes, expected);
    }

    @Test
    public void numEquivDominoPairs_Case2() {
        int[][] dominoes = {
                {1, 2},
        };
        int expected = 0;
        assertMoreSolution(dominoes, expected);
    }

    private void assertMoreSolution(int[][] dominoes, int expected) {
        Assert.assertEquals(expected, mTestSolution.numEquivDominoPairs(dominoes));
        Assert.assertEquals(expected, mTestSolution.numEquivDominoPairs2(dominoes));
    }
}