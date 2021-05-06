package com.wenmq.cn.leetcode;

import com.wenmq.cn.tools.ArrayTools;

import org.junit.Assert;

import java.util.List;

public class Asserts {
    public static void assert2dArrayEqual(int[][] expect, int[][] actual) {
        String actualString = ArrayTools.get2DIntString(actual);
        String expectString = ArrayTools.get2DIntString(expect);
        Assert.assertEquals(expectString, actualString);
    }

    public static void assertListEqual(List<?> expect, List<?> actual) {
        Assert.assertEquals(expect.toString(), actual.toString());
    }
}