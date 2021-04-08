package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution383UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution383";
    private Solution383 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution383();
    }

    @Test
    public void testCanConstruct_Case1() {
        String ransomNote = "a";
        String magazine = "b";
        final boolean expect = false;
        boolean actual = mTestSolution.canConstruct(ransomNote, magazine);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testCanConstruct_Case2() {
        String ransomNote = "aa";
        String magazine = "ab";
        final boolean expect = false;
        boolean actual = mTestSolution.canConstruct(ransomNote, magazine);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testCanConstruct_Case3() {
        String ransomNote = "aa";
        String magazine = "aab";
        final boolean expect = true;
        boolean actual = mTestSolution.canConstruct(ransomNote, magazine);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testCanConstruct_Case4() {
        String ransomNote = "aab";
        String magazine = "aa";
        final boolean expect = false;
        boolean actual = mTestSolution.canConstruct(ransomNote, magazine);
        Assert.assertEquals(expect, actual);
    }
}