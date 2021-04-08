package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution884UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution884";
    private Solution884 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution884();
    }

    @Test
    public void testUncommonFromSentences_Case1() {
        String a = "this apple is sweet";
        String b = "this apple is sour";
        String[] actual = mTestSolution.uncommonFromSentences(a, b);
        String[] expect = new String[]{"sweet", "sour"};
        Assert.assertArrayEquals(expect, actual);
    }

    @Test
    public void testUncommonFromSentences_Case2() {
        String a = "apple apple";
        String b = "banana";
        String[] actual = mTestSolution.uncommonFromSentences(a, b);
        String[] expect = new String[]{"banana"};
        Assert.assertArrayEquals(expect, actual);
    }
}