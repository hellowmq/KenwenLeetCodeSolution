package com.wenmq.leetcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution976UnitTest {
    String TAG = "Solution454";

    private Solution976 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution976();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testLargestPerimeter_Case1() {
        int[] A = {2, 1, 2};
        assertEquals(mTestSolution.largestPerimeter(A), 5);
    }

    @Test
    public void testLargestPerimeter_Case2() {
        int[] A = {1, 2, 1};
        assertEquals(mTestSolution.largestPerimeter(A), 0);
    }

    @Test
    public void testLargestPerimeter_Case3() {
        int[] A = {3, 2, 3, 4};
        assertEquals(mTestSolution.largestPerimeter(A), 10);
    }

    @Test
    public void testLargestPerimeter_Case4() {
        int[] A = {3, 6, 2, 3};
        assertEquals(mTestSolution.largestPerimeter(A), 8);
    }

}
