package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1854UnitTest {

    private Solution1854 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1854();
    }

    @Test
    public void maximumPopulation_Case1() {
        int[][] logs = new int[][]{
                {1993, 1999},
                {2000, 2010},
        };
        int expected = 1993;
        Assert.assertEquals(expected, mTestSolution.maximumPopulation(logs));
    }

    @Test
    public void maximumPopulation_Case2() {
        int[][] logs = new int[][]{
                {1950, 1961},
                {1960, 1971},
                {1970, 1981},
        };
        int expected = 1960;
        Assert.assertEquals(expected, mTestSolution.maximumPopulation(logs));
    }
}