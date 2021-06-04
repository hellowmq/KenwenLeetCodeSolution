package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1394UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1394";

    private Solution1394 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1394();
    }

    @Test
    public void testFindLucky_Case1() {
        int[] arr = new int[]{
                2, 2, 3, 4
        };
        int expected = 2;
        assertMoreSolution(arr, expected);
    }

    @Test
    public void testFindLucky_Case2() {
        int[] arr = new int[]{
                1, 2, 2, 3, 3, 3
        };
        int expected = 3;
        assertMoreSolution(arr, expected);
    }

    @Test
    public void testFindLucky_Case3() {
        int[] arr = new int[]{
                2, 2, 2, 3, 3
        };
        int expected = -1;
        assertMoreSolution(arr, expected);
    }

    @Test
    public void testFindLucky_Case4() {
        int[] arr = new int[]{
                5
        };
        int expected = -1;
        assertMoreSolution(arr, expected);
    }

    @Test
    public void testFindLucky_Case5() {
        int[] arr = new int[]{
                7, 7, 7, 7, 7, 7, 7
        };
        int expected = 7;
        assertMoreSolution(arr, expected);
    }

    private void assertMoreSolution(int[] arr, int expected) {
        Assert.assertEquals(expected, mTestSolution.findLucky(arr));
        Assert.assertEquals(expected, mTestSolution.findLucky2(arr));
    }

}