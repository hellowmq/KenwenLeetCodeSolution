package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1317UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1317";

    private Solution1317 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1317();
    }

    @Test
    public void testGetNoZeroIntegers_Case1() {
        int n = 2;
        int[] noZeroIntegers = mTestSolution.getNoZeroIntegers(n);
        Assert.assertEquals(n, noZeroIntegers[0] + noZeroIntegers[1]);
    }

    @Test
    public void testGetNoZeroIntegers_Case2() {
        int n = 11;
        int[] noZeroIntegers = mTestSolution.getNoZeroIntegers(n);
        Assert.assertEquals(n, noZeroIntegers[0] + noZeroIntegers[1]);
    }

    @Test
    public void testGetNoZeroIntegers_Case3() {
        int n = 10000;
        int[] noZeroIntegers = mTestSolution.getNoZeroIntegers(n);
        Assert.assertEquals(n, noZeroIntegers[0] + noZeroIntegers[1]);
    }

    @Test
    public void testGetNoZeroIntegers_Case4() {
        int n = 69;
        int[] noZeroIntegers = mTestSolution.getNoZeroIntegers(n);
        Assert.assertEquals(n, noZeroIntegers[0] + noZeroIntegers[1]);
    }

    @Test
    public void testGetNoZeroIntegers_Case5() {
        int n = 1010;
        int[] noZeroIntegers = mTestSolution.getNoZeroIntegers(n);
        Assert.assertEquals(n, noZeroIntegers[0] + noZeroIntegers[1]);
    }

    @Test
    public void testGetNoZeroIntegers_Case6() {
        int n = 1;
        Assert.assertNull(mTestSolution.getNoZeroIntegers(n));
    }
}