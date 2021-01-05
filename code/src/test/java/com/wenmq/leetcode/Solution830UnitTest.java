package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class Solution830UnitTest {

    String TAG = "com.wenmq.leetcode.Solution830";
    private Solution830 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution830();
    }

    @Test
    public void testLargeGroupPositions_Case1() {
        String s = "abbxxxxzzy";
        Integer[][] result = {{3, 6}};
        List<List<Integer>> lists = mTestSolution.largeGroupPositions(s);
        Assert.assertEquals(result.length, lists.size());
        for (int i = 0; i < lists.size(); i++) {
            Assert.assertArrayEquals(result[i], lists.get(i).toArray());
        }
    }

    @Test
    public void testLargeGroupPositions_Case2() {
        String s = "abc";
        Integer[][] result = {};
        List<List<Integer>> lists = mTestSolution.largeGroupPositions(s);
        Assert.assertEquals(result.length, lists.size());
        for (int i = 0; i < lists.size(); i++) {
            Assert.assertArrayEquals(result[i], lists.get(i).toArray());
        }
    }

    @Test
    public void testLargeGroupPositions_Case3() {
        String s = "abcdddeeeeaabbbcd";
        Integer[][] result = {{3, 5}, {6, 9}, {12, 14}};
        List<List<Integer>> lists = mTestSolution.largeGroupPositions(s);
        Assert.assertEquals(result.length, lists.size());
        for (int i = 0; i < lists.size(); i++) {
            Assert.assertArrayEquals(result[i], lists.get(i).toArray());
        }
    }

    @Test
    public void testLargeGroupPositions_Case4() {
        String s = "aba";
        Integer[][] result = {};
        List<List<Integer>> lists = mTestSolution.largeGroupPositions(s);
        Assert.assertEquals(result.length, lists.size());
        for (int i = 0; i < lists.size(); i++) {
            Assert.assertArrayEquals(result[i], lists.get(i).toArray());
        }
    }
}