package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1528UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1528";

    private Solution1528 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1528();
    }

    @Test
    public void testRestoreString_Case1() {
        String s = "codeleet";
        int[] indices = {
                4, 5, 6, 7, 0, 2, 1, 3
        };
        String expected = "leetcode";
        Assert.assertEquals(expected, mTestSolution.restoreString(s, indices));
    }

    @Test
    public void testRestoreString_Case2() {
        String s = "abc";
        int[] indices = {
                0, 1, 2
        };
        String expected = "abc";
        Assert.assertEquals(expected, mTestSolution.restoreString(s, indices));
    }

    @Test
    public void testRestoreString_Case3() {
        String s = "aiohn";
        int[] indices = {
                3, 1, 4, 2, 0
        };
        String expected = "nihao";
        Assert.assertEquals(expected, mTestSolution.restoreString(s, indices));
    }

    @Test
    public void testRestoreString_Case4() {
        String s = "aaiougrt";
        int[] indices = {
                4, 0, 2, 6, 7, 3, 1, 5
        };
        String expected = "arigatou";
        Assert.assertEquals(expected, mTestSolution.restoreString(s, indices));
    }

    @Test
    public void testRestoreString_Case5() {
        String s = "art";
        int[] indices = {
                1, 0, 2
        };
        String expected = "rat";
        Assert.assertEquals(expected, mTestSolution.restoreString(s, indices));
    }

}