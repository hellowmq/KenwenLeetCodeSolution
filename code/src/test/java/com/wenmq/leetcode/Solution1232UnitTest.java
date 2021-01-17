package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1232UnitTest {

    String TAG = "com.wenmq.leetcode.Solution1232";
    private Solution1232 mTestSolutoin;


    @Before
    public void setUp() throws Exception {
        mTestSolutoin = new Solution1232();

    }

    @Test
    public void testCheckStraightLine_case1() {
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        boolean expect = true;
        boolean actual = mTestSolutoin.checkStraightLine(coordinates);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testCheckStraightLine_case2() {
        int[][] coordinates = {{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};
        boolean expect = false;
        boolean actual = mTestSolutoin.checkStraightLine(coordinates);
        Assert.assertEquals(expect, actual);
    }
}