package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution1417UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1417";

    private Solution1417 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1417();
    }

    @Test
    public void testReformat_Case1() {
        String leetcode = "a0b1c2";
        List<String> expectedList = Arrays.asList(
                "a0b1c2", "0a1b2c", "a0b1c2", "0a1b2c", "0c2a1b"
        );
        // 也是满足题目要求的答案。
        Assert.assertTrue(expectedList.contains(mTestSolution.reformat(leetcode)));
    }

    @Test
    public void testReformat_Case2() {
        String leetcode = "leetcode";
        List<String> expectedList = Collections.singletonList("");
        Assert.assertTrue(expectedList.contains(mTestSolution.reformat(leetcode)));
    }

    @Test
    public void testReformat_Case3() {
        String leetcode = "1229857369";
        List<String> expectedList = Collections.singletonList(
                ""
        );

        Assert.assertTrue(expectedList.contains(mTestSolution.reformat(leetcode)));
    }

    @Test
    public void testReformat_Case4() {
        String leetcode = "covid2019";
        List<String> expectedList = Arrays.asList(
                "c2o0v1i9d", "d2o0v1i9c", "c0v9d2o1i"
        );
        Assert.assertTrue(expectedList.contains(mTestSolution.reformat(leetcode)));
    }

    @Test
    public void testReformat_Case5() {
        String s = "ab123";
        List<String> expectedList = Arrays.asList(
                "1a2b3", "2b1a3"
        );
        Assert.assertTrue(expectedList.contains(mTestSolution.reformat(s)));
    }

    @Test
    public void testReformat_Case6() {
        String s = "ec";
        List<String> expectedList = Collections.singletonList(
                ""
        );
        Assert.assertTrue(expectedList.contains(mTestSolution.reformat(s)));
    }

}