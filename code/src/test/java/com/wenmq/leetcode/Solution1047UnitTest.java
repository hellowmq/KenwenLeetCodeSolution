package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1047UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution1047";
    private Solution1047 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1047();
    }

    @Test
    public void testRemoveDuplicates_Case1() {
        final String str = "abbaca";
        final String expect = "ca";
        Assert.assertEquals(expect, mTestSolution.removeDuplicates(str));
        Assert.assertEquals(expect, mTestSolution.removeDuplicates2(str));
    }
    @Test
    public void testRemoveDuplicates_Case2() {
        final String str = "leetcode";
        final String expect = "ltcode";
        Assert.assertEquals(expect, mTestSolution.removeDuplicates(str));
        Assert.assertEquals(expect, mTestSolution.removeDuplicates2(str));
    }
}