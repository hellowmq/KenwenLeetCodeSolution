package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1734UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1734";

    private Solution1734 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1734();
    }

    @Test
    public void testDecode_Case1() {
        int[] encoded = {
                3, 1
        };
        int[] expected = {
                1, 2, 3
        };
        Assert.assertArrayEquals(expected, mTestSolution.decode(encoded));
    }

    @Test
    public void testDecode_Case2() {
        int[] encoded = {
                6, 5, 4, 6
        };
        int[] expected = {
                2, 4, 1, 5, 3
        };
        Assert.assertArrayEquals(expected, mTestSolution.decode(encoded));
    }

    @Test
    public void testDecode_Case3() {
        int[] encoded = {
                6, 5, 4, 6
        };
        int[] expected = {
                2, 4, 1, 5, 3
        };
        Assert.assertArrayEquals(expected, mTestSolution.decode(encoded));
    }

    @Test
    public void test_getXorResult() {
        Assert.assertEquals(0, Solution1734.getXorResult(-1));
        Assert.assertEquals(0, Solution1734.getXorResult(0));
        Assert.assertEquals(1, Solution1734.getXorResult(1));
        Assert.assertEquals(3, Solution1734.getXorResult(2));
        Assert.assertEquals(0, Solution1734.getXorResult(3));
    }

}