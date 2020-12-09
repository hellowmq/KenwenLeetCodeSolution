package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Solution842UnitTest {

    String TAG = "com.wenmq.leetcode.Solution842";

    Solution842 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution842();
    }

    @Test
    public void testSplitIntoFibonacci_case1() {
        String S = "123456579";
        Integer[] array = {123, 456, 579};
        List<Integer> result = Arrays.asList(array);
        List<Integer> fibonacci = mTestSolution.splitIntoFibonacci(S);
        Assert.assertArrayEquals(result.toArray(), fibonacci.toArray());
    }

    @Test
    public void testSplitIntoFibonacci_case2() {
        String S = "11235813";
        Integer[] array = {1, 1, 2, 3, 5, 8, 13};
        List<Integer> result = Arrays.asList(array);
        List<Integer> fibonacci = mTestSolution.splitIntoFibonacci(S);
        Assert.assertArrayEquals(result.toArray(), fibonacci.toArray());
    }

    @Test
    public void testSplitIntoFibonacci_case3() {
        String S = "112358130";
        Integer[] array = {};
        List<Integer> result = Arrays.asList(array);
        List<Integer> fibonacci = mTestSolution.splitIntoFibonacci(S);
        Assert.assertArrayEquals(result.toArray(), fibonacci.toArray());
    }

    @Test
    public void testSplitIntoFibonacci_case4() {
        String S = "0123";
        Integer[] array = {};
        List<Integer> result = Arrays.asList(array);
        List<Integer> fibonacci = mTestSolution.splitIntoFibonacci(S);
        Assert.assertArrayEquals(result.toArray(), fibonacci.toArray());
    }

    @Test
    public void testSplitIntoFibonacci_case5() {
        String S = "1101111";
        Integer[] array = {11, 0, 11, 11};
        Integer[] array2 = {110, 1, 111};
        List<Integer> result = Arrays.asList(array);
        List<Integer> result2 = Arrays.asList(array2);
        List<Integer> fibonacci = mTestSolution.splitIntoFibonacci(S);
        int count = 0;
        try {
            Assert.assertArrayEquals(result.toArray(), fibonacci.toArray());
            count++;
        } catch (AssertionError ignored) {

        }
        try {
            Assert.assertArrayEquals(result2.toArray(), fibonacci.toArray());
            count++;
        } catch (AssertionError ignored) {

        }
        Assert.assertTrue(count > 0);

    }

}