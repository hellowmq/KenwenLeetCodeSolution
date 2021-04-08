package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution947UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution947";
    private Solution947 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution947();
    }

    @Test
    public void testRemoveStones_case1() {
        int[][] stones = {{0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}};
        int expect = 5;
        int actual = mTestSolution.removeStones(stones);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testRemoveStones_case2() {
        int[][] stones = {{0, 0}, {0, 2}, {1, 1}, {2, 0}, {2, 2}};
        int expect = 3;
        int actual = mTestSolution.removeStones(stones);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testRemoveStones_case3() {
        int[][] stones = {{0, 0}};
        int expect = 0;
        int actual = mTestSolution.removeStones(stones);
        Assert.assertEquals(expect, actual);
    }


    @Test
    public void testRemoveStones_case4() {
        int[][] stones = {{0, 0}, {1, 1}, {1, 0}, {0, 1}, {2, 1}, {2, 2}};
        int expect = 5;
        int actual = mTestSolution.removeStones(stones);
        Assert.assertEquals(expect, actual);
    }

}