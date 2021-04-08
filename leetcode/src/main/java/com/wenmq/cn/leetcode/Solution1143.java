package com.wenmq.cn.leetcode;

/**
 * Q1143
 * https://leetcode-cn.com/problems/longest-common-subsequence/
 */
public class Solution1143 {
    /**
     * DP
     */
    public int longestCommonSubsequence2(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j]);
                dp[i][j] = Math.max(dp[i][j - 1], dp[i][j]);
            }
        }
        return dp[m][n];
    }

    /**
     * 耗时最短的提交
     */
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for (int i = 0; i < text1.length(); ++i) {
            for (int j = 0; j < text2.length(); ++j) {
                dp[i][j] = Math.max(
                        i != 0 ? dp[i - 1][j] : 0,
                        j != 0 ? dp[i][j - 1] : 0
                );
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i][j] = Math.max(
                            dp[i][j],
                            (i != 0 && j != 0 ? dp[i - 1][j - 1] : 0) + 1
                    );
                }
            }
        }
        return dp[text1.length() - 1][text2.length() - 1];
    }
}
