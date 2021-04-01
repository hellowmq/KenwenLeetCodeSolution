package com.wenmq.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution649UnitTest {

    public static final String TAG = "com.wenmq.leetcode.Solution649";
    private Solution649 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution649();
    }

    @Test
    public void testPredictPartyVictory_case1() {
        String senate = "RD";
        String result = "Radiant";
        Assert.assertEquals(result, mTestSolution.predictPartyVictory(senate));
        Assert.assertEquals(result, mTestSolution.predictPartyVictory2(senate));
        Assert.assertEquals(result, mTestSolution.predictPartyVictory3(senate));
        Assert.assertEquals(result, mTestSolution.predictPartyVictory4(senate));
    }

    @Test
    public void testPredictPartyVictory_case2() {
        String senate = "RDD";
        String result = "Dire";
        Assert.assertEquals(result, mTestSolution.predictPartyVictory(senate));
        Assert.assertEquals(result, mTestSolution.predictPartyVictory2(senate));
        Assert.assertEquals(result, mTestSolution.predictPartyVictory3(senate));
        Assert.assertEquals(result, mTestSolution.predictPartyVictory4(senate));
    }

    @Test
    public void testPredictPartyVictory_case3() {
        String senate = "RRDDD";
        String result = "Radiant";
        Assert.assertEquals(result, mTestSolution.predictPartyVictory(senate));
        Assert.assertEquals(result, mTestSolution.predictPartyVictory2(senate));
        Assert.assertEquals(result, mTestSolution.predictPartyVictory3(senate));
        Assert.assertEquals(result, mTestSolution.predictPartyVictory4(senate));
    }
}