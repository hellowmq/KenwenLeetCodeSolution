package com.wenmq.cn.leetcode;

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
        int[][] a = {
                {0, 0, 1, 1},
                {1, 0, 1, 0},
                {1, 1, 0, 0},
        };
        Assert.assertEquals(39, mTestSolution.matrixScore(a));
        Assert.assertEquals(39, mTestSolution.matrixScore2(a));
    }

    @Test
    public void testMatrixScore_Case2() {
        int[][] a = null;
        Assert.assertEquals(0, mTestSolution.matrixScore(a));
        Assert.assertEquals(0, mTestSolution.matrixScore2(a));
    }

}