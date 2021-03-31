package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1502UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution1502";
    private Solution1502 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1502();
    }

    @Test
    public void testCanMakeArithmeticProgression_Case1() {
        int[] arr = new int[]{3, 5, 1};
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.canMakeArithmeticProgression(arr));

    }

    @Test
    public void testCanMakeArithmeticProgression_Case2() {
        int[] arr = new int[]{1, 2, 4};
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.canMakeArithmeticProgression(arr));
    }

    @Test
    public void testCanMakeArithmeticProgression_Case3() {
        int[] arr = new int[]{1, 1, 1};
        final boolean expected = true;
        Assert.assertEquals(expected, mTestSolution.canMakeArithmeticProgression(arr));
    }

    @Test
    public void testCanMakeArithmeticProgression_Case4() {
        int[] arr = new int[]{1, 2, 4, 4};
        final boolean expected = false;
        Assert.assertEquals(expected, mTestSolution.canMakeArithmeticProgression(arr));
    }


}