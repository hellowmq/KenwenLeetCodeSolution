package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution2180UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution2180";

    private Solution2180 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution2180();
    }

    @Test
    public void testCountEven_Case1() {
        // prepare
        int num = 4;
        int expected = 2;

        assertSolution(num, expected);
    }


    @Test
    public void testCountEven_Case2() {
        // prepare
        int num = 30;
        int expected = 14;

        assertSolution(num, expected);
    }

    private void assertSolution(int num, int expected) {
        // invoke
        int actual = mTestSolution.countEven(num);
        int actual2 = mTestSolution.countEven2(num);

        // assert
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected, actual2);
    }
}