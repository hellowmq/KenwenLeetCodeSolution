package com.wenmq.cn.leetcode;

/**
 * Q1732
 * https://leetcode-cn.com/problems/find-the-highest-altitude/
 */
public class Solution1732 {
    /**
     * 累加即可
     */
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int max = 0;
        for (int num : gain) {
            sum += num;
            max = Math.max(sum, max);
        }
        return max;
    }

}
