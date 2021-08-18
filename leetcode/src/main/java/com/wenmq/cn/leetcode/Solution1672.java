package com.wenmq.cn.leetcode;

/**
 * Q1672
 * https://leetcode-cn.com/problems/richest-customer-wealth/
 */
public class Solution1672 {
    /**
     * m == accounts.length
     * n == accounts[i].length
     * 1 <= m, n <= 50
     * 1 <= accounts[i][j] <= 100
     */
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int a : account) {
                sum += a;
            }
            max = Math.max(max, sum);
        }
        return max;
    }

}
