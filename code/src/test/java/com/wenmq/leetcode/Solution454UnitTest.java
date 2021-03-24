package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution454UnitTest {

    String TAG = "Solution454";

    private Solution454 mMTestSolution;

    @Before
    public void setUp() throws Exception {
        mMTestSolution = new Solution454();
    }

    @Test
    public void testFourSumCount_Case1() {
        int[] a = {1, 2};
        int[] b = {-2, -1};
        int[] c = {-1, 2};
        int[] d = {0, 2};
        int expected = 2;
        TimeUtils2.post(() -> Assert.assertEquals(expected, mMTestSolution.fourSumCount(a, b, c, d)));
        TimeUtils2.post(() -> Assert.assertEquals(expected, mMTestSolution.fourSumCount2(a, b, c, d)));


    }

    @Test
    public void testFourSumCount2_case2() {
        int[] a = {1, 2, 3, 4};
        int[] b = {-2, -1, 3, 4};
        int[] c = {-1, 2, 3, 4};
        int[] d = {0, 2, 3, 4};
        int expected = 3;
        TimeUtils2.post(() -> Assert.assertEquals(expected, mMTestSolution.fourSumCount(a, b, c, d)));
        TimeUtils2.post(() -> Assert.assertEquals(expected, mMTestSolution.fourSumCount2(a, b, c, d)));
    }
}