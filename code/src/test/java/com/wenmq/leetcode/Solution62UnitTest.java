package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution62UnitTest {

    String TAG = "com.wenmq.leetcode.Solution62";

    Solution62 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution62();
    }

    @Test
    public void testUniquePaths_1() {
        int m = 3;
        int n = 7;
        int result = 28;
        Assert.assertEquals(result, mTestSolution.uniquePaths(m, n));
        Assert.assertEquals(result, mTestSolution.uniquePaths2(m, n));
    }

    @Test
    public void testUniquePaths_2() {
        int m = 3;
        int n = 2;
        int result = 3;
        Assert.assertEquals(result, mTestSolution.uniquePaths(m, n));
        Assert.assertEquals(result, mTestSolution.uniquePaths2(m, n));
    }

    @Test
    public void testUniquePaths_3() {
        int m = 7;
        int n = 3;
        int result = 28;
        Assert.assertEquals(result, mTestSolution.uniquePaths(m, n));
        Assert.assertEquals(result, mTestSolution.uniquePaths2(m, n));
    }

    @Test
    public void testUniquePaths_4() {
        int m = 3;
        int n = 3;
        int result = 6;
        Assert.assertEquals(result, mTestSolution.uniquePaths(m, n));
        Assert.assertEquals(result, mTestSolution.uniquePaths2(m, n));
    }

}