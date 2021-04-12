package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1694UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1694";

    private Solution1694 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1694();
    }

    @Test
    public void testReformatNumber_Case1() {
        String number = "1-23-45 6";
        String expected = "123-456";
        assertMoreSolution(number, expected);
    }

    @Test
    public void testReformatNumber_Case2() {
        String number = "123 4-567";
        String expected = "123-45-67";
        assertMoreSolution(number, expected);
    }

    @Test
    public void testReformatNumber_Case3() {
        String number = "123 4-5678";
        String expected = "123-456-78";
        assertMoreSolution(number, expected);
    }

    @Test
    public void testReformatNumber_Case4() {
        String number = "12";
        String expected = "12";
        assertMoreSolution(number, expected);
    }

    @Test
    public void testReformatNumber_Case5() {
        String number = "--17-5 229 35-39475 ";
        String expected = "175-229-353-94-75";
        assertMoreSolution(number, expected);
    }

    private void assertMoreSolution(String number, String expected) {
        Assert.assertEquals(expected, mTestSolution.reformatNumber(number));
        Assert.assertEquals(expected, mTestSolution.reformatNumber2(number));
    }
}