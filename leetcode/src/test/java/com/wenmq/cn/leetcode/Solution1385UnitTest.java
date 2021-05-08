package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1385UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1385";

    private Solution1385 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1385();
    }

    @Test
    public void testFindTheDistanceValue_Case1() {
        int[] arr1 = new int[]{
                4, 5, 8
        };
        int[] arr2 = new int[]{
                10, 9, 1, 8
        };
        int d = 2;
        int expected = 2;
        assetMoreSolution(arr1, arr2, d, expected);
    }

    @Test
    public void testFindTheDistanceValue_Case2() {
        int[] arr1 = new int[]{
                1, 4, 2, 3
        };
        int[] arr2 = new int[]{
                -4, -3, 6, 10, 20, 30
        };
        int d = 3;
        int expected = 2;
        assetMoreSolution(arr1, arr2, d, expected);
    }

    @Test
    public void testFindTheDistanceValue_Case3() {
        int[] arr1 = new int[]{
                2, 1, 100, 3
        };
        int[] arr2 = new int[]{
                -5, -2, 10, -3, 7
        };
        int d = 6;
        int expected = 1;
        assetMoreSolution(arr1, arr2, d, expected);
    }

    @Test
    public void testFindTheDistanceValue_Case4() {
        int[] arr1 = new int[]{
                -3, 10, 2, 8, 0, 10
        };
        int[] arr2 = new int[]{
                -9, -1, -4, -9, -8
        };
        int d = 9;
        int expected = 2;
        assetMoreSolution(arr1, arr2, d, expected);
    }

    @SuppressWarnings({"checkstyle:LineLength"})
    @Test
    public void testFindTheDistanceValue_Case5() {
        int[] arr1 = new int[]{
                -673, -682, 738, 628, -219, 706, -100, -170, -759, 1000, 230, -703, -448, -396, 365, 406, 637, 308, 236, 951, -984, 100, 950, -981, 883, 669, 316, -729, -223, 529, 150, 929, 807, -793, -59, -938, 595, -116, 225, 391, -136, -435, 911, -242, -164, -169, 240, -54, -891, -797, -36, 595, -924, 323, 442, 428
        };
        int[] arr2 = new int[]{
                -999, 663, -914, 703, -773, 202, -715, 86, 40, 563, -271, 128, -446, 603, 163, 861, 983, 341, -271, 642, -30, 678, 428, -498, 899, 655, 273, -509, -784, 151, 949, -268, 785, -676, -762, 590, -917, 876, 441, -358, -135, 801, 489, -291, -481, 346, 281, -9, -1, -4, -9, -8
        };
        int d = 98;
        int expected = 0;
        assetMoreSolution(arr1, arr2, d, expected);
    }

    private void assetMoreSolution(int[] arr1, int[] arr2, int d, int expected) {
        Assert.assertEquals(expected, mTestSolution.findTheDistanceValue(arr1, arr2, d));
        Assert.assertEquals(expected, mTestSolution.findTheDistanceValue2(arr1, arr2, d));
        Assert.assertEquals(expected, mTestSolution.findTheDistanceValue3(arr1, arr2, d));
        Assert.assertEquals(expected, mTestSolution.findTheDistanceValue4(arr1, arr2, d));
    }
}