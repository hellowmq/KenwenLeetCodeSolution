package com.wenmq.cn.leetcode;

/**
 * Q714
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/
 */
public class Solution714 {
    /**
     * 典型 DP 问题
     */
    public int maxProfit(int[] prices, int fee) {
        int len = prices.length;
        if (len < 2) {
            return 0;
        }
        int res = 0;
        int min = prices[0];
        for (int i = 1; i < len; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                if (prices[i] - fee > min) {
                    res += prices[i] - min - fee;
                    // 最关键的操作
                    min = prices[i] - fee;
                }
            }
        }
        return res;
    }

}
