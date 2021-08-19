package com.wenmq.cn.leetcode;

import static com.wenmq.cn.leetcode.Solution303.NumArray;

import com.wenmq.cn.leetcode.Solution303.NumArray2;

import org.junit.Assert;
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
        String[] commands = new String[]{
                "NumArray", "sumRange", "sumRange", "sumRange"
        };
        int[][] parameters = new int[][]{
                {-2, 0, 3, -5, 2, -1},
                {0, 2},
                {2, 5},
                {0, 5},
        };
        Integer[] result = new Integer[]{
                null, 1, -1, -3
        };
        NumArray numArray = null;
        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case "NumArray":
                    numArray = new NumArray(parameters[i]);
                    break;
                case "sumRange":
                    int actual = numArray.sumRange(parameters[i][0], parameters[i][1]);
                    Assert.assertEquals(result[i], Integer.valueOf(actual));
                    break;
                default:
                    // ignore
            }
        }
    }

    @Test
    public void test_NumArray2Case0() {
        String[] commands = new String[]{
                "NumArray", "sumRange", "sumRange", "sumRange"
        };
        int[][] parameters = new int[][]{
                {-2, 0, 3, -5, 2, -1},
                {0, 2},
                {2, 5},
                {0, 5},
        };
        Integer[] result = new Integer[]{
                null, 1, -1, -3
        };
        NumArray2 numArray = null;
        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case "NumArray":
                    numArray = new NumArray2(parameters[i]);
                    break;
                case "sumRange":
                    int actual = numArray.sumRange(parameters[i][0], parameters[i][1]);
                    Assert.assertEquals(result[i], Integer.valueOf(actual));
                    break;
                default:
                    // ignore
            }
        }
    }
}