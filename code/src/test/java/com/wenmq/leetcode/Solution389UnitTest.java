package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
        char e = 'e';
        Assert.assertEquals(e, mTestSolution.findTheDifference(s, t));
        Assert.assertEquals(e, mTestSolution.findTheDifference2(s, t));
        Assert.assertEquals(e, mTestSolution.findTheDifference3(s, t));
    }

    @Test
    public void testFindTheDifference_case2() {
        String s = "";
        String t = "y";
        char e = 'y';
        Assert.assertEquals(e, mTestSolution.findTheDifference(s, t));
        Assert.assertEquals(e, mTestSolution.findTheDifference2(s, t));
        Assert.assertEquals(e, mTestSolution.findTheDifference3(s, t));
    }

    @Test
    public void testFindTheDifference_case3() {
        String s = "a";
        String t = "aa";
        char e = 'a';
        Assert.assertEquals(e, mTestSolution.findTheDifference(s, t));
        Assert.assertEquals(e, mTestSolution.findTheDifference2(s, t));
        Assert.assertEquals(e, mTestSolution.findTheDifference3(s, t));
    }

    @Test
    public void testFindTheDifference_case4() {
        String s = "ae";
        String t = "aea";
        char e = 'a';
        Assert.assertEquals(e, mTestSolution.findTheDifference(s, t));
        Assert.assertEquals(e, mTestSolution.findTheDifference2(s, t));
        Assert.assertEquals(e, mTestSolution.findTheDifference3(s, t));
    }
}