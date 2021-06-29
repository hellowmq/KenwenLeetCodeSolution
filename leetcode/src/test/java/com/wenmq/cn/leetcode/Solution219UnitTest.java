package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution219UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution219";


    private Solution219 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution219();
    }

    @Test
    public void testContainsNearbyDuplicate_Case1() {
        int[] nums = new int[]{1, 2, 3, 1};
        int k = 3;
        final boolean expected = true;
        assertMoreSolution(nums, k, expected);
    }

    @Test
    public void testContainsNearbyDuplicate_Case2() {
        int[] nums = new int[]{1, 0, 1, 1};
        int k = 1;
        final boolean expected = true;
        assertMoreSolution(nums, k, expected);
    }

    @Test
    public void testContainsNearbyDuplicate_Case3() {
        int[] nums = new int[]{1, 2, 3, 1, 2, 3};
        int k = 2;
        final boolean expected = false;
        assertMoreSolution(nums, k, expected);
    }

    @Test
    public void testContainsNearbyDuplicate_Case4() {
        int[] nums = new int[]{-1, -1};
        int k = 1;
        final boolean expected = true;
        assertMoreSolution(nums, k, expected);
    }

    @Test
    public void testContainsNearbyDuplicate_Case5() {
        int[] nums = new int[100];
        int k = 1;
        final boolean expected = true;
        assertMoreSolution(nums, k, expected);
    }

    @Test
    public void testContainsNearbyDuplicate_Case6() {
        int[] nums = new int[100];
        int k = 0;
        final boolean expected = false;
        assertMoreSolution(nums, k, expected);
    }

    private void assertMoreSolution(int[] nums, int k, boolean expected) {
        Assert.assertEquals(expected, mTestSolution.containsNearbyDuplicate(nums, k));
        Assert.assertEquals(expected, mTestSolution.containsNearbyDuplicate2(nums, k));
        Assert.assertEquals(expected, mTestSolution.containsNearbyDuplicate3(nums, k));
    }
}