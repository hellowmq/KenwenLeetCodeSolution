package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1592UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1592";

    private Solution1592 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1592();
    }

    @Test
    public void testReorderSpaces_Case1() {
        String text = "  this   is  a sentence ";
        String expected = "this   is   a   sentence";
        Assert.assertEquals(expected, mTestSolution.reorderSpaces(text));
    }

    @Test
    public void testReorderSpaces_Case2() {
        String text = " practice   makes   perfect";
        String expected = "practice   makes   perfect ";
        Assert.assertEquals(expected, mTestSolution.reorderSpaces(text));
    }

    @Test
    public void testReorderSpaces_Case3() {
        String text = "hello   world";
        String expected = "hello   world";
        Assert.assertEquals(expected, mTestSolution.reorderSpaces(text));
    }

    @Test
    public void testReorderSpaces_Case4() {
        String text = "  walks  udp package   into  bar a";
        String expected = "walks  udp  package  into  bar  a ";
        Assert.assertEquals(expected, mTestSolution.reorderSpaces(text));
    }

    @Test
    public void testReorderSpaces_Case5() {
        String text = "a";
        String expected = "a";
        Assert.assertEquals(expected, mTestSolution.reorderSpaces(text));
    }


}