package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

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
        assertMoreSolution(nums, val, expected, expectedArray);
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
        assertMoreSolution(nums, val, expected, expectedArray);
    }

    @Test
    public void testRemoveElement_Case3() {
        int[] nums = new int[]{
                2
        };
        int val = 3;
        int expected = 1;
        int[] expectedArray = new int[]{
                2
        };
        assertMoreSolution(nums, val, expected, expectedArray);
    }

    @Test
    public void testRemoveElement_null() {
        int[] nums = new int[]{

        };
        int val = 0;
        int expected = 0;
        int[] expectedArray = new int[]{

        };
        assertMoreSolution(nums, val, expected, expectedArray);
    }

    private void assertMoreSolution(int[] nums, int val, int expected, int[] expectedArray) {
        int[] forkSourceArray1 = Arrays.copyOf(nums, nums.length);
        int actual = mTestSolution.removeElement(forkSourceArray1, val);
        Assert.assertEquals(expected, actual);
        assertArrayDeleted(forkSourceArray1, expectedArray, expected);

        int[] forkSourceArray2 = Arrays.copyOf(nums, nums.length);
        int actual2 = mTestSolution.removeElement2(forkSourceArray2, val);
        Assert.assertEquals(expected, actual2);
        assertArrayDeleted(forkSourceArray2, expectedArray, expected);

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