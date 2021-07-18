package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution961UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution961";


    private Solution961 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution961();
    }

    @Test
    public void testRepeatedNTimes_Case1() {
        int[] nums = {
                1, 2, 3, 3
        };
        int expected = 3;
        assertMoreSolution(nums, expected);
    }

    @Test
    public void testRepeatedNTimes_Case2() {
        int[] nums = {
                2, 1, 2, 5, 3, 2
        };
        int expected = 2;
        assertMoreSolution(nums, expected);
    }

    @Test
    public void testRepeatedNTimes_Case3() {
        int[] nums = {
                5, 1, 5, 2, 5, 3, 5, 4
        };
        int expected = 5;
        assertMoreSolution(nums, expected);
    }

    @Test
    public void testRepeatedNTimes_Case4() {
        int[] nums = {
                10000, 10000, 1, 2
        };
        int expected = 10000;
        assertMoreSolution(nums, expected);
    }

    @Test
    public void testRepeatedNTimes_Case5() {
        int[] nums = {
                10000, 1, 2, 10000
        };
        int expected = 10000;
        assertMoreSolution(nums, expected);
    }


    @Test
    public void testRepeatedNTimes_Case6() {
        int[] nums = {
                0, 10000, 1, 10000
        };
        int expected = 10000;
        assertMoreSolution(nums, expected);
    }

    @Test
    public void testRepeatedNTimes_CaseNone() {
        int[] nums = {

        };
        int expected = 0;
        Assert.assertEquals(expected, mTestSolution.repeatedNTimes(nums));

    }

    private void assertMoreSolution(int[] nums, int expected) {
        Assert.assertEquals(expected, mTestSolution.repeatedNTimes(nums));
        Assert.assertEquals(expected, mTestSolution.repeatedNTimes2(nums));
    }
}