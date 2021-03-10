package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution917UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution917";
    private Solution917 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution917();
    }

    @Test
    public void testReverseOnlyLetters_Case1() {
        String s = "ab-cd";
        String actual = mTestSolution.reverseOnlyLetters(s);
        String expected = "dc-ba";
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testReverseOnlyLetters_Case2() {
        String s = "a-bC-dEf-ghIj";
        String actual = mTestSolution.reverseOnlyLetters(s);
        String expected = "j-Ih-gfE-dCba";
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testReverseOnlyLetters_Case3() {
        String s = "Test1ng-Leet=code-Q!";
        String actual = mTestSolution.reverseOnlyLetters(s);
        String expected = "Qedo1ct-eeLg=ntse-T!";
        Assert.assertEquals(expected,actual);
    }
}