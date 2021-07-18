package com.wenmq.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Solution1018UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1018";


    private Solution1018 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1018();
    }

    @Test
    public void testPrefixesDivBy5_Case1() {
        int[] nums = new int[]{
                0, 1, 1
        };
        List<Boolean> expected = Arrays.asList(
                true, false, false
        );
        assertMoreSolution(nums, expected);
    }

    @Test
    public void testPrefixesDivBy5_Case2() {
        int[] nums = new int[]{
                1, 1, 1
        };
        List<Boolean> expected = Arrays.asList(
                false, false, false
        );
        assertMoreSolution(nums, expected);
    }

    @Test
    public void testPrefixesDivBy5_Case3() {
        int[] nums = new int[]{
                0, 1, 1, 1, 1, 1
        };
        List<Boolean> expected = Arrays.asList(
                true, false, false, false, true, false
        );
        assertMoreSolution(nums, expected);
    }

    @Test
    public void testPrefixesDivBy5_Case4() {
        int[] nums = new int[]{
                1, 1, 1, 0, 1
        };
        List<Boolean> expected = Arrays.asList(
                false, false, false, false, false
        );
        assertMoreSolution(nums, expected);
    }

    private void assertMoreSolution(int[] nums, List<Boolean> expected) {
        Asserts.assertListEqual(expected, mTestSolution.prefixesDivBy5(nums));
        Asserts.assertListEqual(expected, mTestSolution.prefixesDivBy5_2(nums));
    }

}