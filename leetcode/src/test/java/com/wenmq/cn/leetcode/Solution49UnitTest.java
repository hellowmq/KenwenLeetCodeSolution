package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution49UnitTest {

    public static final String TAG = "com.wenmq.cn.leetcode.Solution49";
    private Solution49 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution49();
    }

    @Test
    public void testGroupAnagrams_() {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[][] sets = {
                {"ate", "eat", "tea"},
                {"nat", "tan"},
                {"bat"}
        };
        List<List<String>> expect = new ArrayList<>();
        expect.add(Arrays.asList(sets[0]));
        expect.add(Arrays.asList(sets[1]));
        expect.add(Arrays.asList(sets[2]));
        List<List<String>> actual = mTestSolution.groupAnagrams(input);
        Assert.assertEquals(expect.size(), actual.size());

        // actual have more than one correct results.
        // do not assert arrayEquals

    }

    @Test
    public void testGroupAnagrams2_() {

        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[][] sets = {
                {"ate", "eat", "tea"},
                {"nat", "tan"},
                {"bat"}
        };
        List<List<String>> expect = new ArrayList<>();
        expect.add(Arrays.asList(sets[0]));
        expect.add(Arrays.asList(sets[1]));
        expect.add(Arrays.asList(sets[2]));
        List<List<String>> actual = mTestSolution.groupAnagrams2(input);
        Assert.assertEquals(expect.size(), actual.size());

        // actual have more than one correct results.
        // do not assert arrayEquals
    }
}