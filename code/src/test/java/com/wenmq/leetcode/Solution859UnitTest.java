package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution859UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution859";

    private Solution859 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution859();
    }

    @Test
    public void testBuddyStrings_Case1() {
        String a = "ab";
        String b = "ba";
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.buddyStrings(a, b));
        Assert.assertEquals(expected, mTestSolution.buddyStrings2(a, b));
    }

    @Test
    public void testBuddyStrings_Case2() {
        String a = "ab";
        String b = "ab";
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.buddyStrings(a, b));
        Assert.assertEquals(expected, mTestSolution.buddyStrings2(a, b));
    }

    @Test
    public void testBuddyStrings_Case3() {
        String a = "aa";
        String b = "aa";
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.buddyStrings(a, b));
        Assert.assertEquals(expected, mTestSolution.buddyStrings2(a, b));
    }

    @Test
    public void testBuddyStrings_Case4() {
        String a = "aaaaaaabc";
        String b = "aaaaaaacb";
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.buddyStrings(a, b));
        Assert.assertEquals(expected, mTestSolution.buddyStrings2(a, b));
    }

    @Test
    public void testBuddyStrings_Case5() {
        String a = "";
        String b = "aa";
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.buddyStrings(a, b));
        Assert.assertEquals(expected, mTestSolution.buddyStrings2(a, b));
    }

    @Test
    public void testBuddyStrings_Case6() {
        String a = "ab";
        String b = "ca";
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.buddyStrings(a, b));
        Assert.assertEquals(expected, mTestSolution.buddyStrings2(a, b));
    }

    @Test
    public void testBuddyStrings_Case7() {
        String a = "ab";
        String b = "ac";
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.buddyStrings(a, b));
        Assert.assertEquals(expected, mTestSolution.buddyStrings2(a, b));
    }

    @Test
    public void testBuddyStrings_Case8() {
        String a = "abcd";
        String b = "acbe";
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.buddyStrings(a, b));
        Assert.assertEquals(expected, mTestSolution.buddyStrings2(a, b));
    }

    @Test
    public void testBuddyStrings_Case9() {
        String a = "qwertyuiopasdfghjklzxcvbnma";
        String b = "qwertyuiopasdfghjklzxcvbnma";
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.buddyStrings(a, b));
        Assert.assertEquals(expected, mTestSolution.buddyStrings2(a, b));
    }

}