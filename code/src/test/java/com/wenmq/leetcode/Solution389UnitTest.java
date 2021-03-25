package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution389UnitTest {

    String TAG = "com.wenmq.leetcode.Solution389";
    private Solution389 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution389();
    }

    @Test
    public void testFindTheDifference_case1() {
        String s = "abcd";
        String t = "abcde";
        char expected = 'e';
        Assert.assertEquals(expected, mTestSolution.findTheDifference(s, t));
        Assert.assertEquals(expected, mTestSolution.findTheDifference2(s, t));
        Assert.assertEquals(expected, mTestSolution.findTheDifference3(s, t));
    }

    @Test
    public void testFindTheDifference_case2() {
        String s = "";
        String t = "y";
        char expected = 'y';
        Assert.assertEquals(expected, mTestSolution.findTheDifference(s, t));
        Assert.assertEquals(expected, mTestSolution.findTheDifference2(s, t));
        Assert.assertEquals(expected, mTestSolution.findTheDifference3(s, t));
    }

    @Test
    public void testFindTheDifference_case3() {
        String s = "a";
        String t = "aa";
        char expected = 'a';
        Assert.assertEquals(expected, mTestSolution.findTheDifference(s, t));
        Assert.assertEquals(expected, mTestSolution.findTheDifference2(s, t));
        Assert.assertEquals(expected, mTestSolution.findTheDifference3(s, t));
    }

    @Test
    public void testFindTheDifference_case4() {
        String s = "ae";
        String t = "aea";
        char expected = 'a';
        Assert.assertEquals(expected, mTestSolution.findTheDifference(s, t));
        Assert.assertEquals(expected, mTestSolution.findTheDifference2(s, t));
        Assert.assertEquals(expected, mTestSolution.findTheDifference3(s, t));
    }

    /**
     * 无意义单测，覆盖编译需要语句
     */
    @Test
    public void testFindTheDifference_case5() {
        Assert.assertEquals('a', mTestSolution.findTheDifference3("", ""));
    }


}