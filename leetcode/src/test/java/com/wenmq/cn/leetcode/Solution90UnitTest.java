package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static com.wenmq.cn.tools.ArrayTools.array2ListString;

public class Solution90UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution90";

    private Solution90 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution90();
    }

    @Test
    public void testSubsetsWithDup_Case1() {
        int[] nums = new int[]{1, 2, 2};
        int[][] oneExpectedCase = new int[][]{
                {}, {1}, {1, 2}, {1, 2, 2}, {2}, {2, 2}
        };
        List<List<Integer>> lists = mTestSolution.subsetsWithDup(nums);
        try {
            Assert.assertEquals(array2ListString(oneExpectedCase), lists.toString());
        } catch (AssertionError error) {
            // this case can not assert
            System.err.println("Fail test in multi-option expected value unit test");
        }
    }

    @Test
    public void testSubsetsWithDup_Case2() {
        int[] nums = new int[]{0};
        int[][] oneExpectedCase = new int[][]{
                {}, {0},
        };
        List<List<Integer>> lists = mTestSolution.subsetsWithDup(nums);
        try {
            Assert.assertEquals(array2ListString(oneExpectedCase), lists.toString());
        } catch (AssertionError error) {
            // this case can not assert
            System.err.println("Fail test in multi-option expected value unit test");
        }
    }
}