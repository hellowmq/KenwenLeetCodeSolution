package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1925UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1925";


    private Solution1925 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1925();
    }

    @Test
    public void testCountTriples_Case1() {
        int n = 5;
        int expected = 2;
        assertMoreSolution(n, expected);
    }

    @Test
    public void testCountTriples_Case2() {
        int n = 10;
        int expected = 4;
        assertMoreSolution(n, expected);
    }

    @Test
    public void testCountTriples_Case3() {
        int n = 12;
        int expected = 4;
        assertMoreSolution(n, expected);
    }

    private void assertMoreSolution(int n, int expected) {
        Assert.assertEquals(expected, mTestSolution.countTriples(n));
        Assert.assertEquals(expected, mTestSolution.countTriples2(n));
    }
}