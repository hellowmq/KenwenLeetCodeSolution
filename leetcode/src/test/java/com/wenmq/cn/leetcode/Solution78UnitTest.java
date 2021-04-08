package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static com.wenmq.cn.tools.ArrayTools.array2ListString;

public class Solution78UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution78";
    private Solution78 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution78();
    }

    @Test
    public void testSubsets_Case1() {
        int[] array = new int[]{1, 2, 3};
        List<List<Integer>> subsets = mTestSolution.subsets(array);
        int[][] mesh = {
                {1, 2, 3},
                {1, 2},
                {1, 3},
                {1},
                {2, 3},
                {2},
                {3},
                {}
        };
        String oneOfSuccess = array2ListString(mesh);
        Assert.assertEquals(oneOfSuccess, subsets.toString());
    }

    @Test
    public void testSubsets_Case2() {
        int[] array = new int[]{0};
        List<List<Integer>> subsets = mTestSolution.subsets(array);
        int[][] mesh = {
                {0},
                {}
        };
        String oneOfSuccess = array2ListString(mesh);
        Assert.assertEquals(oneOfSuccess, subsets.toString());
    }

    @Test
    public void testSubsets2_Case1() {
        int[] array = new int[]{1, 2, 3};
        List<List<Integer>> subsets = mTestSolution.subsets2(array);
        int[][] mesh = {
                {},
                {1},
                {2},
                {1, 2},
                {3},
                {1, 3},
                {2, 3},
                {1, 2, 3},
        };
        String oneOfSuccess = array2ListString(mesh);
        Assert.assertEquals(oneOfSuccess, subsets.toString());
    }

    @Test
    public void testSubsets2_Case2() {
        int[] array = new int[]{0};
        List<List<Integer>> subsets = mTestSolution.subsets2(array);
        int[][] mesh = {
                {},
                {0},
        };
        String oneOfSuccess = array2ListString(mesh);
        Assert.assertEquals(oneOfSuccess, subsets.toString());
    }
}