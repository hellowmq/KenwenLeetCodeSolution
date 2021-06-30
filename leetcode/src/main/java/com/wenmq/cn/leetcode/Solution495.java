package com.wenmq.cn.leetcode;

/**
 * Q495
 * https://leetcode-cn.com/problems/teemo-attacking/
 */
public class Solution495 {
    /**
     * 方法一：
     */
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries == null || timeSeries.length == 0) {
            return 0;
        }
        int sum = 0;
        int end = 0;
        for (int t : timeSeries) {
            if (t < end) {
                sum -= end - t;
            }
            end = t + duration;
            sum += duration;
        }
        return sum;
    }

    public int findPoisonedDuration2(int[] timeSeries, int duration) {
        if (timeSeries == null || timeSeries.length == 0) {
            return 0;
        }
        int sum = timeSeries[timeSeries.length - 1];
        int end = 0;
        for (int t : timeSeries) {
            if (t < end) {
                sum -= t - end;
            }
            end = t + duration;
        }
        return sum;
    }
}