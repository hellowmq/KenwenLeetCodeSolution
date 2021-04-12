package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1700UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1700";

    private Solution1700 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1700();
    }

    @Test
    public void testCountStudents_Case1() {
        int[] students = new int[]{1, 1, 0, 0};
        int[] sandwiches = new int[]{0, 1, 0, 1};
        int expected = 0;
        Assert.assertEquals(expected,
                mTestSolution.countStudents(students, sandwiches));
    }

    @Test
    public void testCountStudents_Case2() {
        int[] students = new int[]{1, 1, 1, 0, 0, 1};
        int[] sandwiches = new int[]{1, 0, 0, 0, 1, 1};
        int expected = 3;
        Assert.assertEquals(expected,
                mTestSolution.countStudents(students, sandwiches));
    }
}