package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution387UnitTest {

    public static final String TAG = "com.wenmq.cn.leetcode.Solution387";
    private Solution387 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution387();
    }

    @Test
    public void testFirstUniqChar_case1() {
        int expected = 0;
        String s = "leetcode";
        Assert.assertEquals(expected, mTestSolution.firstUniqChar(s));
        Assert.assertEquals(expected, mTestSolution.firstUniqChar2(s));
        Assert.assertEquals(expected, mTestSolution.firstUniqChar3(s));
    }

    @Test
    public void testFirstUniqChar_case2() {
        int expected = 2;
        String s = "loveleetcode";
        Assert.assertEquals(expected, mTestSolution.firstUniqChar(s));
        Assert.assertEquals(expected, mTestSolution.firstUniqChar2(s));
        Assert.assertEquals(expected, mTestSolution.firstUniqChar3(s));
    }

    @Test
    public void testFirstUniqChar_case3() {
        int expected = 29;
        String s = "aaaaaaaaaa" + "aaaaaaaaaa" + "aaaaaaaaab";
        Assert.assertEquals(expected, mTestSolution.firstUniqChar(s));
        Assert.assertEquals(expected, mTestSolution.firstUniqChar2(s));
        Assert.assertEquals(expected, mTestSolution.firstUniqChar3(s));
    }

    @Test
    public void testFirstUniqChar_case4() {
        int expected = -1;
        String s = "aaaaaaaaaa";
        Assert.assertEquals(expected, mTestSolution.firstUniqChar(s));
        Assert.assertEquals(expected, mTestSolution.firstUniqChar2(s));
        Assert.assertEquals(expected, mTestSolution.firstUniqChar3(s));
    }
}