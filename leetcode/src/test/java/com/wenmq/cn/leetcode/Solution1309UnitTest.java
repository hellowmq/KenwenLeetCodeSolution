package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1309UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1309";

    private Solution1309 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1309();
    }

    @Test
    public void testFreqAlphabets_Case1() {
        String s = "10#11#12";
        String expected = "jkab";
        Assert.assertEquals(expected, mTestSolution.freqAlphabets(s));
    }

    @Test
    public void testFreqAlphabets_Case2() {
        String s = "1326#";
        String expected = "acz";
        Assert.assertEquals(expected, mTestSolution.freqAlphabets(s));
    }

    @Test
    public void testFreqAlphabets_Case3() {
        String s = "25#";
        String expected = "y";
        Assert.assertEquals(expected, mTestSolution.freqAlphabets(s));
    }

    @Test
    public void testFreqAlphabets_Case4() {
        String s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        String expected = "abcdefghijklmnopqrstuvwxyz";
        Assert.assertEquals(expected, mTestSolution.freqAlphabets(s));
    }
}