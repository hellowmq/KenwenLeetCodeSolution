package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1013UnitTest {

    private Solution1013 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1013();
    }

    @Test
    public void test_CanThreePartsEqualSum_Case1() {
        int[] arr = new int[]{
                0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1
        };
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.canThreePartsEqualSum(arr));
    }

    @Test
    public void test_CanThreePartsEqualSum_Case2() {
        int[] arr = new int[]{
                0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1
        };
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.canThreePartsEqualSum(arr));
    }

    @Test
    public void test_CanThreePartsEqualSum_Case3() {
        int[] arr = new int[]{
                3, 3, 6, 5, -2, 2, 5, 1, -9, 4
        };
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.canThreePartsEqualSum(arr));
    }

    @Test
    public void test_CanThreePartsEqualSum_Case4() {
        int[] arr = new int[]{
                3, 3, 6, 5, -2, 2, 5, 1, -9, 3
        };
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.canThreePartsEqualSum(arr));
    }

    @Test
    public void test_CanThreePartsEqualSum_Case5() {
        int[] arr = new int[]{
                0, 0, 0, 0
        };
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.canThreePartsEqualSum(arr));
    }

    @Test
    public void test_CanThreePartsEqualSum_Case6() {
        int[] arr = new int[]{
                1, -1, 1, -1
        };
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.canThreePartsEqualSum(arr));
    }
}