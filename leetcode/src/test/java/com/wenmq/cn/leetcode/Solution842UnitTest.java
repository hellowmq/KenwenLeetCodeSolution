package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution842UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution842";

    Solution842 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution842();
    }

    @Test
    public void testSplitIntoFibonacci_case1() {
        String s = "123456579";
        Integer[] array = {123, 456, 579};
        List<Integer> result = Arrays.asList(array);
        List<Integer> fibonacci = mTestSolution.splitIntoFibonacci(s);
        Assert.assertArrayEquals(result.toArray(), fibonacci.toArray());
    }

    @Test
    public void testSplitIntoFibonacci_case2() {
        String s = "11235813";
        Integer[] array = {1, 1, 2, 3, 5, 8, 13};
        List<Integer> result = Arrays.asList(array);
        List<Integer> fibonacci = mTestSolution.splitIntoFibonacci(s);
        Assert.assertArrayEquals(result.toArray(), fibonacci.toArray());
    }

    @Test
    public void testSplitIntoFibonacci_case3() {
        String s = "112358130";
        final List<Integer> result = Collections.emptyList();
        List<Integer> fibonacci = mTestSolution.splitIntoFibonacci(s);
        Assert.assertArrayEquals(result.toArray(), fibonacci.toArray());
    }

    @Test
    public void testSplitIntoFibonacci_case4() {
        String s = "0123";
        final List<Integer> result = Collections.emptyList();
        List<Integer> fibonacci = mTestSolution.splitIntoFibonacci(s);
        Assert.assertArrayEquals(result.toArray(), fibonacci.toArray());
    }

    @Test
    public void testSplitIntoFibonacci_case5() {
        String s = "1101111";
        Integer[] array = {11, 0, 11, 11};
        Integer[] array2 = {110, 1, 111};
        List<Integer> result = Arrays.asList(array);
        List<Integer> result2 = Arrays.asList(array2);
        List<Integer> fibonacci = mTestSolution.splitIntoFibonacci(s);
        int count = 0;
        try {
            Assert.assertArrayEquals(result.toArray(), fibonacci.toArray());
            count++;
        } catch (AssertionError ignored) {
            //ignore
        }
        try {
            Assert.assertArrayEquals(result2.toArray(), fibonacci.toArray());
            count++;
        } catch (AssertionError ignored) {
            //ignore
        }
        Assert.assertTrue(count > 0);

    }

    @Test
    public void testSplitIntoFibonacci_case6() {
        String s = "539834657215398346785398346991079669377161950407626991734534318677529701785098211336528511";
        // 539834657,21,539834678,539834699,1079669377,1619504076,2699173453,4318677529,7017850982,11336528511
        final List<Integer> result = Collections.emptyList();
        List<Integer> fibonacci = mTestSolution.splitIntoFibonacci(s);
        Assert.assertArrayEquals(result.toArray(), fibonacci.toArray());
    }


}