package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1431UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1431";

    private Solution1431 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1431();
    }

    @Test
    public void testKidsWithCandies_Case1() {
        int[] candies = {
                2, 3, 5, 1, 3
        };
        int extraCandies = 3;
        List<Boolean> expected = new ArrayList<>(Arrays.asList(
                true, true, true, false, true
        ));
        assertMoreSolution(candies, extraCandies, expected);
    }

    @Test
    public void testKidsWithCandies_Case2() {
        int[] candies = {
                4, 2, 1, 1, 2
        };
        int extraCandies = 1;
        List<Boolean> expected = new ArrayList<>(Arrays.asList(
                true, false, false, false, false
        ));
        assertMoreSolution(candies, extraCandies, expected);
    }

    @Test
    public void testKidsWithCandies_Case3() {
        int[] candies = {
                12, 1, 12
        };
        int extraCandies = 10;
        List<Boolean> expected = new ArrayList<>(Arrays.asList(
                true, false, true
        ));
        assertMoreSolution(candies, extraCandies, expected);
    }

    private void assertMoreSolution(int[] candies, int extraCandies, List<Boolean> expected) {
        Assert.assertEquals(
                expected.toString(),
                mTestSolution.kidsWithCandies(candies, extraCandies).toString()
        );
    }
}