package com.wenmq.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Solution728UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution728";

    private Solution728 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution728();
    }

    @Test
    public void testSelfDividingNumbers() {
        int left = 1;
        int right = 22;
        List<Integer> expect = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22
        );
        Asserts.assertListEqual(expect,
                mTestSolution.selfDividingNumbers(left, right)
        );
    }
}