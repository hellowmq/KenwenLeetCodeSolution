package com.wenmq.cn.leetcode;

/**
 * Q1572
 * https://leetcode-cn.com/problems/matrix-diagonal-sum/
 */
public class Solution1572 {
    /**
     * n == mat.length == mat[i].length
     * 1 <= n <= 100
     * 1 <= mat[i][j] <= 100
     */
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i] + mat[n - i - 1][i];
        }
        if (n % 2 == 1) {
            sum -= mat[n >> 1][n >> 1];
        }
        return sum;
    }

}
