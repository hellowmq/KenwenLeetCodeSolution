package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("ArraysAsListWithZeroOrOneArgument")
public class Solution5UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution5";


    private Solution5 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution5();
    }

    @Test
    public void testLongestPalindrome_Case1() {
        String s = "babad";
        List<String> expectedList = new ArrayList<>(Arrays.asList(
                "bab", "aba"
        ));
        extracted(s, expectedList);
    }

    @Test
    public void testLongestPalindrome_Case2() {
        String s = "cbbd";
        List<String> expectedList = new ArrayList<>(Arrays.asList(
                "bb"
        ));
        extracted(s, expectedList);
    }

    @Test
    public void testLongestPalindrome_Case3() {
        String s = "a";
        List<String> expectedList = new ArrayList<>(Arrays.asList(
                "a"
        ));
        extracted(s, expectedList);
    }

    @Test
    public void testLongestPalindrome_Case4() {
        String s = "ac";
        List<String> expectedList = new ArrayList<>(Arrays.asList(
                "a", "c"
        ));
        extracted(s, expectedList);
    }

    private void extracted(String s, List<String> expectedList) {
        Assert.assertTrue(expectedList.contains(mTestSolution.longestPalindrome(s)));
        Assert.assertTrue(expectedList.contains(mTestSolution.longestPalindrome2(s)));
    }
}