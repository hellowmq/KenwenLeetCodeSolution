package com.wenmq.leetcode;

import com.wenmq.tools.ArrayTools;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution566UnitTest {

    private static final String TAG = "com.wenmq.leetcode.Solution566";
    private Solution566 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution566();
    }

    @Test
    public void testSolution_Case1() {
        int[][] mesh = new int[][]{{1, 2}, {3, 4}};
        int r = 1;
        int c = 4;
        int[][] expect = new int[][]{{1, 2, 3, 4}};
        int[][] actual = mTestSolution.matrixReshape(mesh, r, c);
        String expectStr = ArrayTools.get2DIntString(expect);
        String actualStr = ArrayTools.get2DIntString(actual);
        Assert.assertEquals(expectStr, actualStr);
    }

    @Test
    public void testSolution_Case2() {
        int[][] mesh = new int[][]{{1, 2}, {3, 4}};
        int r = 2;
        int c = 4;
        int[][] expect = new int[][]{{1, 2}, {3, 4}};
        int[][] actual = mTestSolution.matrixReshape(mesh, r, c);
        String expectStr = ArrayTools.get2DIntString(expect);
        String actualStr = ArrayTools.get2DIntString(actual);
        Assert.assertEquals(expectStr, actualStr);
    }
}