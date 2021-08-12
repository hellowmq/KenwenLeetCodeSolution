package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution599UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution599";


    private Solution599 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution599();
    }

    @Test
    public void testFindRestaurant_Case1() {
        String[] list1 = new String[]{
                "Shogun", "Tapioca Express", "Burger King", "KFC"
        };
        String[] list2 = new String[]{
                "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"
        };
        String[] expected = new String[]{
                "Shogun"
        };
        Assert.assertArrayEquals(expected, mTestSolution.findRestaurant(list1, list2));
    }

    @Test
    public void testFindRestaurant_Case2() {
        String[] list1 = new String[]{
                "Shogun", "Tapioca Express", "Burger King", "KFC"
        };
        String[] list2 = new String[]{
                "KFC", "Shogun", "Burger King"
        };
        String[] expected = new String[]{
                "Shogun"
        };
        Assert.assertArrayEquals(expected, mTestSolution.findRestaurant(list1, list2));
    }

}