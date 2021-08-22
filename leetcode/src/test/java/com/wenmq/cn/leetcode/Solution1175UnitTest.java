package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1175UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1175";


    private Solution1175 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1175();
    }

    @Test
    public void testNumPrimeArrangements_Case1() {
      int n = 5;
      int expected = 12;
      Assert.assertEquals(expected, mTestSolution.numPrimeArrangements(n));
    }

    @Test
    public void testNumPrimeArrangements_Case2() {
      int n = 100;
      int expected = 682289015;
      Assert.assertEquals(expected, mTestSolution.numPrimeArrangements(n));
    }
}