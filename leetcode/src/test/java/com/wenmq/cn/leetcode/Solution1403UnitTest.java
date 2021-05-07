package com.wenmq.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution1403UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1403";

    private Solution1403 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1403();
    }

    @Test
    public void testMinSubsequence_Case1() {
        int[] nums = new int[]{
                4, 3, 10, 9, 8
        };
        List<Integer> expected = Arrays.asList(
                10, 9
        );
        Asserts.assertListEqual(expected, mTestSolution.minSubsequence(nums));
    }

    @Test
    public void testMinSubsequence_Case2() {
        int[] nums = new int[]{
                4, 4, 7, 6, 7
        };
        List<Integer> expected = Arrays.asList(
                7, 7, 6
        );
        Asserts.assertListEqual(expected, mTestSolution.minSubsequence(nums));
    }

    @Test
    public void testMinSubsequence_Case3() {
        int[] nums = new int[]{
                6
        };

        List<Integer> expected = Collections.singletonList(6);
        Asserts.assertListEqual(expected, mTestSolution.minSubsequence(nums));
    }

    @Test
    public void testMinSubsequence_Case4() {
        int[] nums = new int[]{

        };
        List<Integer> expected = new ArrayList<>();
        Asserts.assertListEqual(expected, mTestSolution.minSubsequence(nums));
    }
}