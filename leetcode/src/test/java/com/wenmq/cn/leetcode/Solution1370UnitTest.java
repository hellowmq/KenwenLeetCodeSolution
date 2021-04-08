package com.wenmq.cn.leetcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution1370UnitTest {

    Solution1370 mTestSolution;

    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution1370();
    }


    @Test
    public void testSortString_Case1() {
        Assert.assertEquals(mTestSolution.sortString("aaaabbbbcccc"), "abccbaabccba");
        Assert.assertEquals(mTestSolution.sortString("rat"), "art");
        Assert.assertEquals(mTestSolution.sortString("leetcode"), "cdelotee");
        Assert.assertEquals(mTestSolution.sortString("ggggggg"), "ggggggg");
        Assert.assertEquals(mTestSolution.sortString("spo"), "ops");

    }

}