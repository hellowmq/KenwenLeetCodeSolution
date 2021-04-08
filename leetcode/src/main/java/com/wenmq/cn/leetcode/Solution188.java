package com.wenmq.cn.leetcode;

/**
 * Q188
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-iv/
 */
public class Solution188 {
    /**
     * 做不出来，看到了提交里 1 ms 的解答
     */
    public int maxProfit(int k, int[] prices) {
        if (k > prices.length / 2) {
            return maxProfitNormal(prices);
        }
        //第i次交易后持有/不持有的金额
        int[][] dp = new int[k + 1][2];
        for (int i = 0; i <= k; i++) {
            dp[i][1] = Integer.MIN_VALUE;
        }
        for (int price : prices) {
            for (int i = 1; i <= k; i++) {
                if (dp[i][1] < dp[i - 1][0] - price) {
                    dp[i][1] = dp[i - 1][0] - price;
                }
                if (dp[i][0] < dp[i][1] + price) {
                    dp[i][0] = dp[i][1] + price;
                }
            }
        }
        return dp[k][0];
    }

    /**
     * 满足 k > prices.length / 2 时是一种特殊情况
     * 抽出来只是为了提高运行速度
     */
    private int maxProfitNormal(int[] prices) {
        int length = prices.length;
        if (length < 2) {
            return 0;
        }
        int notHold = 0;
        int hold = -prices[0];
        for (int i = 1; i < length; i++) {
            int price = prices[i];
            hold = Math.max(hold,notHold - price);
            notHold = Math.max(notHold,hold + price);
        }
        return notHold;
    }

}
