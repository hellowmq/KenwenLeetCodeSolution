package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution67UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution67";
    Solution67 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution67();
    }

    @Test
    public void testAddBinary_case() {
        String a = "11";
        String b = "1";
        String expect = "100";
        String actual1 = mTestSolution.addBinary(a, b);
        Assert.assertEquals(expect, actual1);
        String actual2 = mTestSolution.addBinary2(a, b);
        Assert.assertEquals(expect, actual2);
    }

    @Test
    public void testAddBinary_case2() {
        String a = "1010";
        String b = "1011";
        String expect = "10101";
        String actual1 = mTestSolution.addBinary(a, b);
        Assert.assertEquals(expect, actual1);
        String actual2 = mTestSolution.addBinary2(a, b);
        Assert.assertEquals(expect, actual2);
    }

    @Test
    public void testAddBinary_case3() {
        String a = "10010110";
        String b = "10110";
        String expect = "10101100";
        String actual1 = mTestSolution.addBinary(a, b);
        Assert.assertEquals(expect, actual1);
        String actual2 = mTestSolution.addBinary2(a, b);
        Assert.assertEquals(expect, actual2);
    }
}