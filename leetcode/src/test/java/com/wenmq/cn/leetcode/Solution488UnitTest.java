package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution488UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution488";
    private Solution488 mSolution488;


    @Before
    public void setUp() throws Exception {
        mSolution488 = new Solution488();
    }

    @Test
    public void testNextGreaterElements_Case1() {
        int[] array = new int[]{
                1, 2, 1
        };
        int[] expectArray = new int[]{
                2, -1, 2
        };
        Assert.assertArrayEquals(expectArray, mSolution488.nextGreaterElements(array));
        Assert.assertArrayEquals(expectArray, mSolution488.nextGreaterElements2(array));
    }
}