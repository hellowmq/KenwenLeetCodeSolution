package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class Solution1608UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1608";
    private Solution1608 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1608();
    }

    @Test
    public void testSpecialArray_Case1() {
        int[] array = new int[]{3, 5};
        int expected = 2;
        Assert.assertEquals(expected, mTestSolution.specialArray(getCopyArray(array)));
        Assert.assertEquals(expected, mTestSolution.specialArray2(getCopyArray(array)));
    }

    @Test
    public void testSpecialArray_Case2() {
        int[] array = new int[]{0, 0};
        int expected = -1;
        Assert.assertEquals(expected, mTestSolution.specialArray(getCopyArray(array)));
        Assert.assertEquals(expected, mTestSolution.specialArray2(getCopyArray(array)));
    }

    @Test
    public void testSpecialArray_Case3() {
        int[] array = new int[]{0, 4, 3, 0, 4};
        int expected = 3;
        Assert.assertEquals(expected, mTestSolution.specialArray(getCopyArray(array)));
        Assert.assertEquals(expected, mTestSolution.specialArray2(getCopyArray(array)));
    }

    @Test
    public void testSpecialArray_Case4() {
        int[] array = new int[]{3, 6, 7, 7, 0};
        int expected = -1;
        Assert.assertEquals(expected, mTestSolution.specialArray(getCopyArray(array)));
        Assert.assertEquals(expected, mTestSolution.specialArray2(getCopyArray(array)));
    }

    @Test
    public void testSpecialArray_Case5() {
        int[] array = new int[]{0, 0, 0, 0, 0, 0, 0, 1};
        int expected = 1;
        Assert.assertEquals(expected, mTestSolution.specialArray(getCopyArray(array)));
        Assert.assertEquals(expected, mTestSolution.specialArray2(getCopyArray(array)));
    }

    private int[] getCopyArray(int[] array) {
        return Arrays.copyOf(array, array.length);
    }
}