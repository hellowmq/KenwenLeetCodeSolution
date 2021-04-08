package com.wenmq.cn.leetcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution976UnitTest {
    private static final String TAG = "Solution454";

    private Solution976 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution976();
    }

    @Test
    public void testLargestPerimeter_Case1() {
        int[] a = {2, 1, 2};
        assertEquals(mTestSolution.largestPerimeter(a), 5);
    }

    @Test
    public void testLargestPerimeter_Case2() {
        int[] a = {1, 2, 1};
        assertEquals(mTestSolution.largestPerimeter(a), 0);
    }

    @Test
    public void testLargestPerimeter_Case3() {
        int[] a = {3, 2, 3, 4};
        assertEquals(mTestSolution.largestPerimeter(a), 10);
    }

    @Test
    public void testLargestPerimeter_Case4() {
        int[] a = {3, 6, 2, 3};
        assertEquals(mTestSolution.largestPerimeter(a), 8);
    }

}
