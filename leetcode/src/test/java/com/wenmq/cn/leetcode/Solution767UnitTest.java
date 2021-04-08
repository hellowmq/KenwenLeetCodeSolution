package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution767UnitTest {

    public static final String TAG = "com.wenmq.cn.leetcode.Solution767";
    Solution767 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution767();
    }

    @Test
    public void testReorganizeString_case1() {
        String s = "aab";
        String result = "aba";
        Assert.assertEquals(mTestSolution.reorganizeString(s), result);
        Assert.assertEquals(mTestSolution.reorganizeString2(s), result);
    }

    @Test
    public void testReorganizeString_case2() {
        String s = "aaab";
        String result = "";
        Assert.assertEquals(mTestSolution.reorganizeString(s), result);
        Assert.assertEquals(mTestSolution.reorganizeString2(s), result);
    }

    @Test
    public void testReorganizeString_case3() {
        String s = "b";
        String result = "b";
        Assert.assertEquals(mTestSolution.reorganizeString(s), result);
        Assert.assertEquals(mTestSolution.reorganizeString2(s), result);
    }

    @Test
    public void testReorganizeString_case4() {
        String s = "aabb";
        String result = "abab";
        Assert.assertEquals(mTestSolution.reorganizeString(s), result);
        Assert.assertEquals(mTestSolution.reorganizeString2(s), result);
    }
}