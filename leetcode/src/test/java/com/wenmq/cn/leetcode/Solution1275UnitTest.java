package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("SpellCheckingInspection")
public class Solution1275UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1275";

    private Solution1275 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1275();
    }

    @Test
    public void testTictactoe_Case1() {
        int[][] moves = {
                {0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}
        };
        String expected = "A";
        Assert.assertEquals(expected, mTestSolution.tictactoe(moves));
    }

    @Test
    public void testTictactoe_Case2() {
        int[][] moves = {
                {0, 0}, {1, 1}, {0, 1}, {0, 2}, {1, 0}, {2, 0}
        };
        String expected = "B";
        Assert.assertEquals(expected, mTestSolution.tictactoe(moves));
    }

    @Test
    public void testTictactoe_Case3() {
        int[][] moves = {
                {0, 0}, {1, 1}, {2, 0}, {1, 0}, {1, 2}, {2, 1}, {0, 1}, {0, 2}, {2, 2}
        };
        String expected = "Draw";
        Assert.assertEquals(expected, mTestSolution.tictactoe(moves));
    }

    @Test
    public void testTictactoe_Case4() {
        int[][] moves = {
                {0, 0},
                {1, 1},
        };
        String expected = "Pending";
        Assert.assertEquals(expected, mTestSolution.tictactoe(moves));
    }
}