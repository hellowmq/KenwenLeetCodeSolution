package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1UnitTest {

    private Solution1 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1();
    }

    @Test
    public void testTwoSum_Case1() {
        int[] nums = new int[]{
                2, 7, 11, 15
        };
        int target = 9;
        int[] expected = new int[]{
                0, 1
        };
        testImpl(nums, target, expected);
    }

    @Test
    public void testTwoSum_Case2() {
        int[] nums = new int[]{
                3, 2, 4
        };
        int target = 6;
        int[] expected = new int[]{1, 2};
        testImpl(nums, target, expected);
    }

    @Test
    public void testTwoSum_Case3() {
        int[] nums = new int[]{
                3, 3
        };
        int target = 6;
        int[] expected = new int[]{0, 1};
        testImpl(nums, target, expected);
    }

    private void testImpl(int[] nums, int target, int[] expected) {
        int[] actual = mTestSolution.twoSum(nums, target);
        Assert.assertNotNull(actual);
        Assert.assertEquals(2, actual.length);
        boolean caseOne = actual[0] == expected[0] && actual[1] == expected[1];
        boolean caseTwo = actual[1] == expected[0] && actual[0] == expected[1];
        if (!(caseOne || caseTwo)) {
            Assert.fail();
        }
    }
}