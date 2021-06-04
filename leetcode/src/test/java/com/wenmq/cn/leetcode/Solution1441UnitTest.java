package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Solution1441UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1441";

    private Solution1441 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1441();
    }

    @Test
    public void testBuildArray_Case1() {
        int[] target = {1, 3};
        int n = 3;
        List<String> expected = Arrays.asList(
                "Push", "Push", "Pop", "Push"
        );
        List<String> actual = mTestSolution.buildArray(target, n);
        Assert.assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void testBuildArray_Case2() {
        int[] target = {1, 2, 3};
        int n = 3;
        List<String> expected = Arrays.asList(
                "Push", "Push", "Push"
        );
        List<String> actual = mTestSolution.buildArray(target, n);
        Assert.assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void testBuildArray_Case3() {
        int[] target = {1, 2};
        int n = 4;
        List<String> expected = Arrays.asList(
                "Push", "Push"
        );
        List<String> actual = mTestSolution.buildArray(target, n);
        Assert.assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void testBuildArray_Case4() {
        int[] target = {2, 3, 4};
        int n = 4;
        List<String> expected = Arrays.asList(
                "Push", "Pop", "Push", "Push", "Push"
        );
        List<String> actual = mTestSolution.buildArray(target, n);
        Assert.assertEquals(expected.toString(), actual.toString());
    }
}