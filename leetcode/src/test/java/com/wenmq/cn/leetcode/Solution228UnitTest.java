package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution228UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution228";


    private Solution228 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution228();
    }

    @Test
    public void testSummaryRanges_Case1() {
        int[] nums = new int[]{
                0, 1, 2, 4, 5, 7
        };
        List<String> result = new ArrayList<>(Arrays.asList(
                "0->2", "4->5", "7"
        ));
        Asserts.assertListEqual(result, mTestSolution.summaryRanges(nums));
    }

    @Test
    public void testSummaryRanges_Case2() {
        int[] nums = new int[]{
                0, 2, 3, 4, 6, 8, 9
        };
        List<String> result = new ArrayList<>(Arrays.asList(
                "0", "2->4", "6", "8->9"
        ));
        Asserts.assertListEqual(result, mTestSolution.summaryRanges(nums));
    }

    @Test
    public void testSummaryRanges_Case3() {
        int[] nums = new int[]{

        };
        List<String> result = new ArrayList<>(Collections.emptyList());
        Asserts.assertListEqual(result, mTestSolution.summaryRanges(nums));
    }


    @Test
    public void testSummaryRanges_Case4() {
        int[] nums = new int[]{
                -1
        };
        List<String> result = new ArrayList<>(Collections.singletonList(
                "-1"
        ));
        Asserts.assertListEqual(result, mTestSolution.summaryRanges(nums));
    }

    @Test
    public void testSummaryRanges_Case5() {
        int[] nums = new int[]{
                0,
        };
        List<String> result = new ArrayList<>(Collections.singletonList(
                "0"
        ));
        Asserts.assertListEqual(result, mTestSolution.summaryRanges(nums));
    }
}