package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution67UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution67";
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
        assertMoreSolution(a, b, expect);
    }

    @Test
    public void testAddBinary_case2() {
        String a = "1010";
        String b = "1011";
        String expect = "10101";
        assertMoreSolution(a, b, expect);
    }

    @Test
    public void testAddBinary_case3() {
        String a = "10010110";
        String b = "10110";
        String expect = "10101100";
        assertMoreSolution(a, b, expect);
    }

    @Test
    public void testAddBinary_case4() {
        String a = "";
        String b = "10110";
        String expect = "10110";
        assertMoreSolution(a, b, expect);
    }


    @Test
    public void testAddBinary_case5() {
        String a = "10110";
        String b = "";
        String expect = "10110";
        assertMoreSolution(a, b, expect);
    }

    private void assertMoreSolution(String a, String b, String expect) {
        Assert.assertEquals(expect, mTestSolution.addBinary(a, b));
        Assert.assertEquals(expect, mTestSolution.addBinary2(a, b));
    }
}