package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1436UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1436";

    private Solution1436 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1436();
    }

    @Test
    public void testDestCity_Case1() {
        List<List<String>> paths = new ArrayList<>();
        paths.add(asList("London", "New York"));
        paths.add(asList("New York", "Lima"));
        paths.add(asList("Lima", "Sao Paulo"));
        String expected = "Sao Paulo";
        assertMoreSolution(paths, expected);

    }

    @Test
    public void testDestCity_Case2() {
        List<List<String>> paths = new ArrayList<>();
        paths.add(asList("B", "C"));
        paths.add(asList("D", "B"));
        paths.add(asList("C", "A"));
        String expected = "A";
        assertMoreSolution(paths, expected);

    }

    @Test
    public void testDestCity_Case3() {
        List<List<String>> paths = new ArrayList<>();
        paths.add(asList("A", "Z"));
        String expected = "Z";
        assertMoreSolution(paths, expected);

    }

    @Test
    public void testDestCity_Case4() {
        List<List<String>> paths = new ArrayList<>();
        paths.add(asList("uOPUfreOta", "VjnupRpODE"));
        paths.add(asList("IQRZkZLnFO", "fALhUgpcro"));
        paths.add(asList("fALhUgpcro", "uOPUfreOta"));
        paths.add(asList("wgpXKgxyNT", "TsTjXKssvd"));
        paths.add(asList("akBDsWlIlI", "IQRZkZLnFO"));
        paths.add(asList("VjnupRpODE", "wgpXKgxyNT"));
        String expected = "TsTjXKssvd";
        assertMoreSolution(paths, expected);
    }

    @Test
    public void testDestCity_CaseNull() {
        Assert.assertNull(mTestSolution.destCity2(new ArrayList<>()));
    }

    private void assertMoreSolution(List<List<String>> paths, String expected) {
        Assert.assertEquals(expected, mTestSolution.destCity(paths));
        Assert.assertEquals(expected, mTestSolution.destCity2(paths));
    }

    private List<String> asList(String... strings) {
        return new ArrayList<>(Arrays.asList(strings));
    }
}