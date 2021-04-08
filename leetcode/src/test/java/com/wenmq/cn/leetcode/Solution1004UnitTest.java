package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1004UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1004";
    private Solution1004 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1004();
    }

    @SuppressWarnings("checkstyle:LocalVariableName")
    @Test
    public void testLongestOnes_Case1() {
        int[] A = new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int K = 2;
        int expected = 6;
        int actual = mTestSolution.longestOnes(A, K);
        Assert.assertEquals(expected, actual);
    }

    @SuppressWarnings("checkstyle:LocalVariableName")
    @Test
    public void testLongestOnes_Case2() {
        int[] A = new int[]{
                0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1
        };
        int K = 3;
        int expected = 10;
        int actual = mTestSolution.longestOnes(A, K);
        Assert.assertEquals(expected, actual);
    }
}