package com.wenmq.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution1380UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1380";

    private Solution1380 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1380();
    }

    @Test
    public void testLuckyNumbers_case1() {
        int[][] matrix = new int[][]{
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17},
        };
        assertMoreSolution(matrix, Collections.singletonList(15));
    }

    @Test
    public void testLuckyNumbers_case2() {
        int[][] matrix = new int[][]{
                {1, 10, 4, 2},
                {9, 3, 8, 7},
                {15, 16, 17, 12},
        };
        assertMoreSolution(matrix, Collections.singletonList(12));
    }

    @Test
    public void testLuckyNumbers_case3() {
        int[][] matrix = new int[][]{
                {7, 8},
                {1, 2},
        };
        assertMoreSolution(matrix, Collections.singletonList(7));
    }

    @Test
    public void testLuckyNumbers_caseEmpty() {
        int[][] matrix = new int[][]{};
        assertMoreSolution(matrix, new ArrayList<>());
    }

    private void assertMoreSolution(int[][] matrix, List<Integer> emptyList) {
        Asserts.assertListEqual(emptyList, mTestSolution.luckyNumbers(matrix));
        Asserts.assertListEqual(emptyList, mTestSolution.luckyNumbers2(matrix));
    }
}