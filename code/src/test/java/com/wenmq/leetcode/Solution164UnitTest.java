package com.wenmq.leetcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution164UnitTest {

    private Solution164 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution164();
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void testSolution_case1() {
        int[] input = new int[]{3, 6, 9, 1};
        Assert.assertEquals(3, mTestSolution.maximumGap(input));
        Assert.assertEquals(3, mTestSolution.maximumGap2(input));
    }

    @Test
    public void testSolution_case2() {
        int[] input = new int[]{1};
        Assert.assertEquals(0, mTestSolution.maximumGap(input));
        Assert.assertEquals(0, mTestSolution.maximumGap2(input));
    }


}