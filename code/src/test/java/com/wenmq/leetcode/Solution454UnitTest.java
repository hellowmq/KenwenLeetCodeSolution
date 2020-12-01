package com.wenmq.leetcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution454UnitTest {

    String TAG = "Solution454";

    private Solution454 mMTestSolution;

    @Before
    public void setUp() throws Exception {
        mMTestSolution = new Solution454();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testFourSumCount_() {
        int[] a = {1, 2};
        int[] b = {-2, -1};
        int[] c = {-1, 2};
        int[] d = {0, 2};
        TimeUtils.getInstance(TAG).start();
        Assert.assertEquals(mMTestSolution.fourSumCount(a, b, c, d), 2);
        TimeUtils.getInstance(TAG).end();

    }

    @Test
    public void testFourSumCount2_() {
        int[] a = {1, 2};
        int[] b = {-2, -1};
        int[] c = {-1, 2};
        int[] d = {0, 2};
        TimeUtils.getInstance(TAG).start();
        Assert.assertEquals(mMTestSolution.fourSumCount2(a, b, c, d), 2);
        TimeUtils.getInstance(TAG).end();

    }

    @Test
    public void testFourSumCount2_case2() {
        int[] a = {1, 2, 3, 4};
        int[] b = {-2, -1, 3, 4};
        int[] c = {-1, 2, 3, 4};
        int[] d = {0, 2, 3, 4};
        TimeUtils.getInstance(TAG).start();
        Assert.assertEquals(mMTestSolution.fourSumCount2(a, b, c, d), 3);
        TimeUtils.getInstance(TAG).end();

    }
}