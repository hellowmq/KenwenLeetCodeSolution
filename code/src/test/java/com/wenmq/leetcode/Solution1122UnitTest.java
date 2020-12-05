package com.wenmq.leetcode;


import org.junit.Before;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Solution1122UnitTest {
    String TAG = "com.wenmq.leetcode.Solution1122";
    Solution1122 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1122();
    }

    @Test
    public void emailValidator_CorrectEmailSimple_ReturnsTrue() {
        int[] a = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] b = {2, 1, 4, 3, 9, 6};
        int[] assertResult = new int[]{2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};
        int[] sortArray = mTestSolution.relativeSortArray(a, b);
        assertThat(sortArray).isEqualTo(assertResult);
    }
}