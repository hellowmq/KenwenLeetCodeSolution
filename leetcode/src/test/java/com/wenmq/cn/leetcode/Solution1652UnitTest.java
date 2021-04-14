package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1652UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1652";

    private Solution1652 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1652();
    }

    @Test
    public void testDecrypt_Case1() {
        int[] code = new int[]{
                5, 7, 1, 4
        };
        int k = 3;
        int[] expected = new int[]{
                12, 10, 16, 13
        };
        Assert.assertArrayEquals(expected, mTestSolution.decrypt(code, k));
    }

    @Test
    public void testDecrypt_Case2() {
        int[] code = new int[]{
                1, 2, 3, 4
        };
        int k = 0;
        int[] expected = new int[]{
                0, 0, 0, 0
        };
        Assert.assertArrayEquals(expected, mTestSolution.decrypt(code, k));
    }

    @Test
    public void testDecrypt_Case3() {
        int[] code = new int[]{
                2, 4, 9, 3
        };
        int k = -2;
        int[] expected = new int[]{
                12, 5, 6, 13
        };
        Assert.assertArrayEquals(expected, mTestSolution.decrypt(code, k));
    }
}