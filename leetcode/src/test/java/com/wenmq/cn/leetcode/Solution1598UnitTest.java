package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1598UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1598";

    private Solution1598 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1598();
    }

    @Test
    public void testMinOperations_Case1() {
        String[] logs = new String[]{
                "d1/", "d2/", "../", "d21/", "./"
        };
        int expected = 2;
        Assert.assertEquals(expected, mTestSolution.minOperations(logs));
    }

    @Test
    public void testMinOperations_Case2() {
        String[] logs = new String[]{
                "d1/", "d2/", "./", "d3/", "../", "d31/"
        };
        int expected = 3;
        Assert.assertEquals(expected, mTestSolution.minOperations(logs));
    }

    @Test
    public void testMinOperations_Case3() {
        String[] logs = new String[]{
                "d1/", "../", "../", "../"
        };
        int expected = 0;
        Assert.assertEquals(expected, mTestSolution.minOperations(logs));
    }
}