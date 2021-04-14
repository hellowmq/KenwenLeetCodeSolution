package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1720UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1720";

    private Solution1720 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1720();
    }

    @Test
    public void testDecode_Case1() {
        int[] decode = new int[]{
                1, 2, 3
        };
        int first = 1;
        int[] expecteds = {
                1, 0, 2, 1
        };
        Assert.assertArrayEquals(expecteds, mTestSolution.decode(decode, first));
    }

    @Test
    public void testDecode_Case2() {
        int[] decode = new int[]{
                6, 2, 7, 3
        };
        int first = 4;
        int[] expecteds = {
                4, 2, 0, 7, 4
        };
        Assert.assertArrayEquals(expecteds, mTestSolution.decode(decode, first));
    }
}