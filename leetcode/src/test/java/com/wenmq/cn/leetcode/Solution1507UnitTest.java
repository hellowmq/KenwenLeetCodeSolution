package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1507UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1507";

    private Solution1507 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1507();
    }

    @Test
    public void testReformatDate_Case1() {
        String date = "20th Oct 2052";
        String expected = "2052-10-20";
        Assert.assertEquals(expected, mTestSolution.reformatDate(date));
    }

    @Test
    public void testReformatDate_Case2() {
        String date = "6th Jun 1933";
        String expected = "1933-06-06";
        Assert.assertEquals(expected, mTestSolution.reformatDate(date));
    }

    @Test
    public void testReformatDate_Case3() {
        String date = "26th May 1960";
        String expected = "1960-05-26";
        Assert.assertEquals(expected, mTestSolution.reformatDate(date));
    }

    @Test
    public void testAppend() {
        StringBuilder sb = new StringBuilder();
        String[] months = {
                "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };

        for (String month : months) {
            mTestSolution.appendMonth(sb, month);
        }
        String expected = "01-02-03-04-05-06-07-08-09-10-11-12-";
        Assert.assertEquals(
                expected,
                sb.toString()
        );
    }
}