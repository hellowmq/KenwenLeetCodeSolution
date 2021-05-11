package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1346UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1346";

    private Solution1346 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1346();
    }

    @Test
    public void testCheckIfExist_Case1() {
        int[] arr = new int[]{
                10, 2, 5, 3
        };
        boolean expected = true;
        assertMoreSolution(arr, expected);
    }

    @Test
    public void testCheckIfExist_Case2() {
        int[] arr = new int[]{
                7, 1, 14, 11
        };
        boolean expected = true;
        assertMoreSolution(arr, expected);
    }

    @Test
    public void testCheckIfExist_Case3() {
        int[] arr = new int[]{
                3, 1, 7, 11
        };
        boolean expected = false;
        assertMoreSolution(arr, expected);
    }

    @Test
    public void testCheckIfExist_Case4() {
        int[] arr = new int[]{
                500, 1000
        };
        boolean expected = true;
        assertMoreSolution(arr, expected);
    }

    @Test
    public void testCheckIfExist_Case5() {
        int[] arr = new int[]{
                -95, -299, 357, 715, -438, -759, 255, 418, -647, -805,
                -546, -182, -523, 13, -79, -227, 537, -655, 993, -526,
                -518, 679, -420, -53, 120, 187, -203, -567, -75, 464,
                -472, -324, 16, 215, -773, 862, -563, -839, -906, -969,
                633, -990, 756, -17, -346, 820, -216, 736, 188, -412,
                881, -599, -181, -673, 802, 688, 553, 323, -689, 625,
                871, -938, -969, -207, -703, 794, 361, 111, -884, 156,
                -223, -480, -734, -838, -53, 335, 720, -379, 855, -971,
                -928, 99, -876, 75, 721, -736, -913, 911
        };
        boolean expected = true;
        assertMoreSolution(arr, expected);
    }

    private void assertMoreSolution(int[] arr, boolean expected) {
        Assert.assertEquals(expected, mTestSolution.checkIfExist(arr));
        Assert.assertEquals(expected, mTestSolution.checkIfExist2(arr));
    }
}