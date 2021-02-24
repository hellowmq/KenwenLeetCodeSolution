package com.wenmq.leetcode;

import com.wenmq.tools.ArrayTools;

import org.junit.Assert;

public class Asserts {
    public static void assert2dArrayEqual(int[][] expect, int[][] actual) {
        String actualString = ArrayTools.get2DIntString(actual);
        String expectString = ArrayTools.get2DIntString(expect);
        Assert.assertEquals(expectString, actualString);
    }
}