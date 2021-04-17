package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1684UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1684";

    private Solution1684 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1684();
    }

    @Test
    public void testCountConsistentStrings_Case1() {
        String allowed = "ab";
        String[] words = new String[]{
                "ad", "bd", "aaab", "baa", "badab"
        };
        int expected = 2;
        Assert.assertEquals(expected, mTestSolution.countConsistentStrings(allowed, words));
    }

    @Test
    public void testCountConsistentStrings_Case2() {
        String abc = "cad";
        String[] words = new String[]{
                "cc", "acd", "b", "ba", "bac", "bad", "ac", "d"
        };
        int expected = 4;
        Assert.assertEquals(expected, mTestSolution.countConsistentStrings(abc, words));
    }
}