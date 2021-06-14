package com.wenmq.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Solution1002UnitTest {

    private Solution1002 mSolution1002;

    @Before
    public void setUp() throws Exception {
        mSolution1002 = new Solution1002();
    }

    @Test
    public void testCommonChars_Case1() {
        String[] words = new String[]{
                "bella", "label", "roller"
        };
        List<String> expect = Arrays.asList(
                "e", "l", "l"
        );
        List<String> result = mSolution1002.commonChars(words);
        Asserts.assertListEqual(expect, result);
    }

    @Test
    public void testCommonChars_Case2() {
        String[] words = new String[]{
                "cool", "lock", "cook"
        };
        List<String> expect = Arrays.asList(
                "c", "o"
        );
        List<String> result = mSolution1002.commonChars(words);
        Asserts.assertListEqual(expect, result);
    }
}