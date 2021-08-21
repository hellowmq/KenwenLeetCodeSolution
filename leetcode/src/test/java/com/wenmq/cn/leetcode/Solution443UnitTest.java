package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution443UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution443";


    private Solution443 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution443();
    }

    @Test
    public void testCompress_Case1() {
        char[] chars = new char[]{
                'a', 'a', 'b', 'b', 'c', 'c', 'c'
        };
        int expected = 6;
        char[] expectedChar = new char[]{
                'a', '2', 'b', '2', 'c', '3'
        };
        int compress = mTestSolution.compress(chars);
        Assert.assertEquals(expected, compress);
        for (int i = 0; i < expected; i++) {
            Assert.assertEquals(expectedChar[i], chars[i]);
        }
    }

    @Test
    public void testCompress_Case2() {
        char[] chars = new char[]{
                'a',
        };
        int expected = 1;
        char[] expectedChar = new char[]{
                'a',
        };
        int compress = mTestSolution.compress(chars);
        Assert.assertEquals(expected, compress);
        for (int i = 0; i < expected; i++) {
            Assert.assertEquals(expectedChar[i], chars[i]);
        }
    }

    @Test
    public void testCompress_Case3() {
        char[] chars = new char[]{
                'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'
        };
        int expected = 4;
        char[] expectedChar = new char[]{
                'a', 'b', '1', '2'
        };
        int compress = mTestSolution.compress(chars);
        Assert.assertEquals(expected, compress);
        for (int i = 0; i < expected; i++) {
            Assert.assertEquals(expectedChar[i], chars[i]);
        }
    }
}