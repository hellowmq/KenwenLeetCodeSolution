package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("SpellCheckingInspection")
public class Solution557UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution557";


    private Solution557 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution557();
    }

    @Test
    public void testReverseWords_Case1() {
      String s = "Let's take LeetCode contest";
      String expected = "s'teL ekat edoCteeL tsetnoc";
      Assert.assertEquals(expected,mTestSolution.reverseWords(s));
      Assert.assertEquals(expected,mTestSolution.reverseWords2(s));
    }


}