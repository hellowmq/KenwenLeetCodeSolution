package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1566UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1566";

    private Solution1566 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1566();
    }

    @Test
    public void testContainsPattern_Case1() {
        int[] arr = new int[]{
                1, 2, 4, 4, 4, 4
        };
        int m = 1;
        int k = 3;
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.containsPattern(arr, m, k));
    }

    @Test
    public void testContainsPattern_Case2() {
        int[] arr = new int[]{
                1, 2, 1, 2, 1, 1, 1, 3
        };
        int m = 2;
        int k = 3;
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.containsPattern(arr, m, k));
    }

    @Test
    public void testContainsPattern_Case3() {
        int[] arr = new int[]{
                1, 2, 1, 2, 1, 3
        };
        int m = 2;
        int k = 2;
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.containsPattern(arr, m, k));
    }

    @Test
    public void testContainsPattern_Case4() {
        int[] arr = new int[]{
                1, 2, 3, 1, 2
        };
        int m = 2;
        int k = 2;
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.containsPattern(arr, m, k));
    }

    @Test
    public void testContainsPattern_Case5() {
        int[] arr = new int[]{
                2, 2, 2, 2
        };
        int m = 2;
        int k = 3;
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.containsPattern(arr, m, k));
    }
}