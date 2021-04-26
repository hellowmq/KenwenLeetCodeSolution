package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Solution1560UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1560";

    private Solution1560 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1560();
    }

    @Test
    public void testMostVisited_Case1() {
        int n = 4;
        int[] rounds = new int[]{
                1, 3, 1, 2
        };
        List<Integer> actual = mTestSolution.mostVisited(n, rounds);
        Integer[] integers = {
                1, 2
        };
        List<Integer> expected = Arrays.asList(integers);
        Assert.assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void testMostVisited_Case2() {
        int n = 2;
        int[] rounds = new int[]{
                2, 1, 2, 1, 2, 1, 2, 1, 2
        };
        List<Integer> actual = mTestSolution.mostVisited(n, rounds);
        Integer[] integers = {
                2
        };
        List<Integer> expected = Arrays.asList(integers);
        Assert.assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void testMostVisited_Case3() {
        int n = 7;
        int[] rounds = new int[]{
                1, 3, 5, 7
        };
        List<Integer> actual = mTestSolution.mostVisited(n, rounds);
        Integer[] integers = {
                1, 2, 3, 4, 5, 6, 7
        };
        List<Integer> expected = Arrays.asList(integers);
        Assert.assertEquals(expected.toString(), actual.toString());
    }
}