package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1832UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1832";


    private Solution1832 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1832();
    }

    @Test
    public void testCheckIfPangram_Case1() {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        final boolean expected = true;
        assertMoreSolution(sentence, expected);
    }

    @Test
    public void testCheckIfPangram_Case2() {
        String sentence = "leetcode";
        final boolean expected = false;
        assertMoreSolution(sentence, expected);
    }

    private void assertMoreSolution(String sentence, boolean expected) {
        Assert.assertEquals(expected, mTestSolution.checkIfPangram(sentence));
        Assert.assertEquals(expected, mTestSolution.checkIfPangram2(sentence));
    }
}