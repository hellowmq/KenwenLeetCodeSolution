package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution482UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution482";


    private Solution482 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution482();
    }

    @Test
    public void testLicenseKeyFormatting_Case1() {
        String s = "5F3Z-2e-9-w";
        int k = 4;
        String expected = "5F3Z-2E9W";
        assertMoreSolution(s, k, expected);
    }

    @Test
    public void testLicenseKeyFormatting_Case2() {
        String s = "2-5g-3-J";
        int k = 2;
        String expected = "2-5G-3J";
        assertMoreSolution(s, k, expected);
    }

    private void assertMoreSolution(String s, int k, String expected) {
        Assert.assertEquals(expected, mTestSolution.licenseKeyFormatting(s, k));
        Assert.assertEquals(expected, mTestSolution.licenseKeyFormatting2(s, k));
    }
}