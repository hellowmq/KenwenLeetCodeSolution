package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution164UnitTest {

    private Solution164 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution164();
    }

    @Test
    public void testSolution_case1() {
        int[] input = new int[]{3, 6, 9, 1};
        int expected = 3;
        assertMoreSolution(input, expected);
    }

    @Test
    public void testSolution_case2() {
        int[] input = new int[]{1};
        int expected = 0;
        assertMoreSolution(input, expected);
    }

    @Test
    public void testSolution_case3() {
        int[] input = new int[]{1, 1, 1, 1};
        int expected = 0;
        assertMoreSolution(input, expected);
    }

    private void assertMoreSolution(int[] input, int expected) {
        Assert.assertEquals(expected, mTestSolution.maximumGap(input));
        Assert.assertEquals(expected, mTestSolution.maximumGap2(input));
    }


}