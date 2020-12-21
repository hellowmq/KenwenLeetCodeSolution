package com.wenmq.leetcode;

/**
 * Q746
 * https://leetcode-cn.com/problems/min-cost-climbing-stairs/
 */
public class Solution746 {


    /**
     * DP 的解题思路在于问题分解
     * 到底位置 k 的最优解为 k-1 走一步或者 k-2 走两步的较小值
     *
     *
     */
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int prev = 0, curr = 0;
        for (int i = 2; i <= n; i++) {
            int next = Math.min(curr + cost[i - 1], prev + cost[i - 2]);
            prev = curr;
            curr = next;
        }
        return curr;
    }
}

