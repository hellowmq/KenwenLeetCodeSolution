package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution27UnitTest {

    private Solution27 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution27();
    }

    @Test
    public void testRemoveElement_Case1() {
        int[] nums = new int[]{
                3, 2, 2, 3
        };
        int val = 3;
        int expected = 2;
        int[] expectedArray = new int[]{
                2, 2
        };
        int actual = mTestSolution.removeElement(nums, val);
        Assert.assertEquals(expected, actual);
        assertArrayDeleted(nums, expectedArray, expected);
    }

    @Test
    public void testRemoveElement_Case2() {
        int[] nums = new int[]{
                0, 1, 2, 2, 3, 0, 4, 2
        };
        int val = 2;
        int expected = 5;
        int[] expectedArray = new int[]{
                0, 1, 4, 0, 3
        };
        int actual = mTestSolution.removeElement(nums, val);
        Assert.assertEquals(expected, actual);
        assertArrayDeleted(nums, expectedArray, expected);
    }


    private void assertArrayDeleted(int[] nums, int[] expectedArray, int expected) {
        int[] set = new int[51];
        for (int i = 0; i < expected; i++) {
            set[expectedArray[i]]++;
            set[nums[i]]--;
        }
        for (int count : set) {
            Assert.assertEquals(0, count);
        }
    }
}