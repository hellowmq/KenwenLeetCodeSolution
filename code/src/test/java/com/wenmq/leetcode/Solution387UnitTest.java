package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution387UnitTest {

    String TAG = "com.wenmq.leetcode.Solution387";
    private Solution387 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution387();
    }

    @Test
    public void testFirstUniqChar_case1() {
        int expected = 0;
        Assert.assertEquals(expected,mTestSolution.firstUniqChar("leetcode"));
        Assert.assertEquals(expected,mTestSolution.firstUniqChar2("leetcode"));
    }

    @Test
    public void testFirstUniqChar_case2() {
        int expected = 2;
        Assert.assertEquals(expected,mTestSolution.firstUniqChar("loveleetcode"));
        Assert.assertEquals(expected,mTestSolution.firstUniqChar2("loveleetcode"));
    }
}