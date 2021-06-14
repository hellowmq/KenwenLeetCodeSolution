package com.wenmq.cn.leetcode;

/**
 * Q474
 * https://leetcode-cn.com/problems/ones-and-zeroes/
 */
public class Solution474 {
    /**
     * 1 <= strs.length <= 600
     * 1 <= strs[i].length <= 100
     * strs[i] 仅由 '0' 和 '1' 组成
     * 1 <= m, n <= 100
     */
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] counts = new int[strs.length][2];
        int count0;
        int count1;
        int sum0 = 0;
        int sum1 = 0;
        String str;
        for (int i = 0; i < strs.length; i++) {
            str = strs[i];
            count0 = 0;
            count1 = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '0') {
                    count0++;
                } else {
                    count1++;
                }
            }
            counts[i][0] = count0;
            counts[i][1] = count1;
            sum0 += count0;
            sum1 += count1;
        }
        m = Math.min(m, sum0);
        n = Math.min(n, sum1);
        int[][] dp = new int[m + 1][n + 1];
        for (int[] count : counts) {
            count0 = count[0];
            count1 = count[1];
            for (int i = m; i - count0 >= 0; i--) {
                for (int j = n; j - count1 >= 0; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - count0][j - count1] + 1);
                }
            }
        }
        return dp[m][n];
    }

}
