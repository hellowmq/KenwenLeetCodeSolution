package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1374UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1374";

    private Solution1374 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1374();
    }

    @Test
    public void testGenerateTheString_Case1() {
        int n = 4;
        checkValid(mTestSolution.generateTheString(n));
    }

    @Test
    public void testGenerateTheString_Case2() {
        int n = 2;
        checkValid(mTestSolution.generateTheString(n));
    }

    @Test
    public void testGenerateTheString_Case3() {
        int n = 7;
        checkValid(mTestSolution.generateTheString(n));
    }

    private void checkValid(String s) {
        int set = 0;
        int exist = 0;
        for (int i = 0; i < s.length(); i++) {
            set ^= 1 << (s.charAt(i) - 'a');
            exist |= 1 << (s.charAt(i) - 'a');
        }
        Assert.assertEquals(set, exist);
    }


}