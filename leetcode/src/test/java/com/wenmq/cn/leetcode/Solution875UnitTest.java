package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

public class Solution875UnitTest {

    private Solution875 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution875();
    }

    @Test
    public void test_MinEatingSpeed_Case1() {
        int[] piles = new int[]{
                3, 6, 7, 11
        };
        int h = 8;
        int expected = 4;
        Assert.assertEquals(expected, mTestSolution.minEatingSpeed(piles, h));
    }

    @Test
    public void test_MinEatingSpeed_Case2() {
        int[] piles = new int[]{
                30, 11, 23, 4, 20
        };
        int h = 5;
        int expected = 30;
        Assert.assertEquals(expected, mTestSolution.minEatingSpeed(piles, h));
    }

    @Test
    public void test_MinEatingSpeed_Case3() {
        int[] piles = new int[]{
                30, 11, 23, 4, 20
        };
        int h = 6;
        int expected = 23;
        Assert.assertEquals(expected, mTestSolution.minEatingSpeed(piles, h));
    }

    @Test
    public void test_MinEatingSpeed_Case4() {
        int[] piles = new int[50];
        Arrays.fill(piles, 10);
        int h = 100;
        int expected = 5;
        Assert.assertEquals(expected, mTestSolution.minEatingSpeed(piles, h));
    }

    @Test
    public void test_MinEatingSpeed_Case5() {
        int[] piles = new int[]{
                312884470
        };
        int h = 968709470;
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.minEatingSpeed(piles, h));
    }
}