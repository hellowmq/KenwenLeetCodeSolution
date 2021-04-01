package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class Solution118UnitTest {
    public static final String TAG = "com.wenmq.leetcode.Solution118";

    Solution118 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution118();
    }

    @Test
    public void testGenerate_Case1() {
        Integer[][] matrix = {{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}};
        int numRows = 5;
        List<List<Integer>> generate;
        generate = mTestSolution.generate(numRows);
        Assert.assertArrayEquals(matrix[0], generate.get(0).toArray());
        Assert.assertArrayEquals(matrix[1], generate.get(1).toArray());
        Assert.assertArrayEquals(matrix[2], generate.get(2).toArray());
        Assert.assertArrayEquals(matrix[3], generate.get(3).toArray());
        Assert.assertArrayEquals(matrix[4], generate.get(4).toArray());
        generate = mTestSolution.generate2(numRows);
        Assert.assertArrayEquals(matrix[0], generate.get(0).toArray());
        Assert.assertArrayEquals(matrix[1], generate.get(1).toArray());
        Assert.assertArrayEquals(matrix[2], generate.get(2).toArray());
        Assert.assertArrayEquals(matrix[3], generate.get(3).toArray());
        Assert.assertArrayEquals(matrix[4], generate.get(4).toArray());
    }

    @Test
    public void testGenerate_Case2() {
        int numRows = 0;
        List<List<Integer>> generate;
        generate = mTestSolution.generate(numRows);
        Assert.assertTrue(generate.isEmpty());
        generate = mTestSolution.generate2(numRows);
        Assert.assertTrue(generate.isEmpty());
    }
}