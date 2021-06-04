package com.wenmq.cn.leetcode;

/**
 * Q1475
 * https://leetcode-cn.com/problems/final-prices-with-a-special-discount-in-a-shop/
 */
public class Solution1475 {
    /**
     * 1 <= prices.length <= 500
     * 1 <= prices[i] <= 10^3
     */
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (prices[i] < prices[j]) {
                    continue;
                }
                prices[i] = prices[i] - prices[j];
                break;
            }
        }
        return prices;
    }

}
