package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Solution448UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution448";
    private Solution448 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution448();
    }

    @Test
    public void testFindDisappearedNumbers_Case1() {
        int[] array = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = Arrays.asList(5, 6);
        List<Integer> actual = mTestSolution.findDisappearedNumbers(array);
        Assert.assertEquals(result.toString(), actual.toString());
    }

    @Test
    public void testFindDisappearedNumbers2_Case1() {
        int[] array = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = Arrays.asList(5, 6);
        List<Integer> actual = mTestSolution.findDisappearedNumbers2(array);
        Assert.assertEquals(result.toString(), actual.toString());
    }
}