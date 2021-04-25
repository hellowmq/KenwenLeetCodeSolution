package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1629UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1629";

    private Solution1629 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1629();
    }

    @Test
    public void testSlowestKey_Case1() {
        int[] time = new int[]{
                9, 29, 49, 50
        };
        String keysPressed = "cbcd";
        char expected = 'c';
        Assert.assertEquals(expected, mTestSolution.slowestKey(time, keysPressed));
    }

    @Test
    public void testSlowestKey_Case2() {
        int[] time = new int[]{
                12, 23, 36, 46, 62
        };
        String keysPressed = "spuda";
        char expected = 'a';
        Assert.assertEquals(expected, mTestSolution.slowestKey(time, keysPressed));
    }

    @Test
    public void testSlowestKey_Case3() {
        int[] time = new int[]{
                28, 65, 97
        };
        String keysPressed = "gaf";
        char expected = 'a';
        Assert.assertEquals(expected, mTestSolution.slowestKey(time, keysPressed));
    }
}