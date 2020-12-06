package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution861UnitTest {

    private Solution861 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution861();
    }

    @Test
    public void testMatrixScore_Case() {
        int[][] A = {
                {0, 0, 1, 1},
                {1, 0, 1, 0},
                {1, 1, 0, 0},
        };
        Assert.assertEquals(39, mTestSolution.matrixScore(A));
        Assert.assertEquals(39, mTestSolution.matrixScore2(A));
    }

}