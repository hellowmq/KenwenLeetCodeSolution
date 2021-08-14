package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1952UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1952";


    private Solution1952 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1952();
    }

    @Test
    public void testIsThree_Case1() {
      int n = 2;
      final boolean expected = false;
      Assert.assertEquals(expected, mTestSolution.isThree(n));
    }

    @Test
    public void testIsThree_Case2() {
      int n = 4;
      final boolean expected = true;
      Assert.assertEquals(expected, mTestSolution.isThree(n));
    }
}