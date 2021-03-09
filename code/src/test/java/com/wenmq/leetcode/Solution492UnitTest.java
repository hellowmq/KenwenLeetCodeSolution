package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution492UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution492";
    private Solution492 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution492();
    }

    @Test
    public void testConstructRectangle_Case1() {
        final int[] expect = new int[]{2, 2};
        int[] actual = mTestSolution.constructRectangle(4);
        Assert.assertArrayEquals(expect, actual);
    }

    @Test
    public void testConstructRectangle_Case2() {
        final int[] expect = new int[]{3, 2};
        int[] actual = mTestSolution.constructRectangle(6);
        Assert.assertArrayEquals(expect, actual);
    }

    @Test
    public void testConstructRectangle_Case3() {
        final int[] expect = new int[]{40, 30};
        int[] actual = mTestSolution.constructRectangle(1200);
        Assert.assertArrayEquals(expect, actual);
    }
}