package com.wenmq.cn.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1678UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution1678";

    private Solution1678 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1678();
    }

    @Test
    public void testInterpret_Case1() {
        String command = "G()(al)";
        String goal = "Goal";
        assertMoreSolution(command, goal);
    }

    @Test
    public void testInterpret_Case2() {
        String command = "G()()()()(al)";
        String goal = "Gooooal";
        assertMoreSolution(command, goal);
    }

    @Test
    public void testInterpret_Case3() {
        String command = "(al)G(al)()()G";
        String goal = "alGalooG";
        assertMoreSolution(command, goal);
    }

    private void assertMoreSolution(String command, String goal) {
        Assert.assertEquals(goal, mTestSolution.interpret(command));
        Assert.assertEquals(goal, mTestSolution.interpret2(command));
    }
}