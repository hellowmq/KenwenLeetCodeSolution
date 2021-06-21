package com.wenmq.cn.leetcode;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution401UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution401";
    private Solution401 mtestSolution;


    @Before
    public void setUp() throws Exception {
        mtestSolution = new Solution401();
    }

    @Test
    public void testReadBinaryWatch_Case1() {
        int turnedOn = 1;
        List<String> expected = Arrays.asList(
                "0:01", "0:02", "0:04", "0:08", "0:16", "0:32", "1:00", "2:00", "4:00", "8:00"
        );
        assertMoreSolution(turnedOn, expected);
    }

    @Test
    public void testReadBinaryWatch_Case2() {
        int turnedOn = 9;
        List<String> expected = Collections.emptyList();
        assertMoreSolution(turnedOn, expected);
    }

    private void assertMoreSolution(int turnedOn, List<String> expected) {
        List<String> list = mtestSolution.readBinaryWatch(turnedOn);
        assertListEqual(expected, list);
        list = new Solution401.Solution().readBinaryWatch(turnedOn);
        assertListEqual(expected, list);
    }

    private void assertListEqual(List<String> expected, List<String> list) {
        assertTrue(list.containsAll(expected));
        assertTrue(expected.containsAll(list));
    }
}