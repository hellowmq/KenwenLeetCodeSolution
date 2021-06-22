package com.wenmq.cn.codinginterviews;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CISolution15UnitTest {

    private static final String TAG = "com.wenmq.cn.codinginterviews.CISolution15";
    private CISolution15 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new CISolution15();
    }

    @Test
    public void testHammingWeight_Case1() {
        int n = 0b00000000000000000000000000001011;
        int expected = 3;
        assertMoreSolution(n, expected);
    }

    @Test
    public void testHammingWeight_Case2() {
        int n = 0b00000000000000000000000010000000;
        int expected = 1;
        assertMoreSolution(n, expected);
    }

    @Test
    public void testHammingWeight_Case3() {
        int n = 0b11111111111111111111111111111101;
        int expected = 31;
        assertMoreSolution(n, expected);
    }

    public void assertMoreSolution(int n, int expected) {
        Assert.assertEquals(expected, mTestSolution.hammingWeight(n));
        Assert.assertEquals(expected, mTestSolution.hammingWeight2(n));
    }
}