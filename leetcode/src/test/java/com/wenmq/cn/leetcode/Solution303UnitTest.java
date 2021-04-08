package com.wenmq.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

public class Solution303UnitTest {

    private static final String TAG = "com.wenmq.cn.leetcode.Solution303";
    private Solution303 mTestSolution;


    @Before
    public void setUp() throws Exception {
        mTestSolution = new Solution303();
    }

    @Test
    public void test_NumArrayCase0() {
        String[] commands = new String[]{"NumArray", "sumRange", "sumRange", "sumRange"};
        int[] nums = {-2, 0, 3, -5, 2, -1};
        Solution303.NumArray numArray = new Solution303.NumArray(nums);
        numArray.sumRange(0, 2);
        numArray.sumRange(2, 5);
        numArray.sumRange(0, 5);
    }
}