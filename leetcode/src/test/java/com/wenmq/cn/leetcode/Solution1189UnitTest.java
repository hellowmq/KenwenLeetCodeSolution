package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1189UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1189";

    private Solution1189 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1189();
    }

    @Test
    public void testMaxNumberOfBalloons_Case1() {
        String text = "nlaebolko";
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.maxNumberOfBalloons(text));
    }

    @Test
    public void testMaxNumberOfBalloons_Case2() {
        String text = "loonbalxballpoon";
        int expected = 2;
        Assert.assertEquals(expected, mTestSolution.maxNumberOfBalloons(text));
    }

    @Test
    public void testMaxNumberOfBalloons_Case3() {
        String text = "leetcode";
        int expected = 0;
        Assert.assertEquals(expected, mTestSolution.maxNumberOfBalloons(text));
    }
}