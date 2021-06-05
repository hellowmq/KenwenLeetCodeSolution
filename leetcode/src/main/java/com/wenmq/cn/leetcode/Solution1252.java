package com.wenmq.cn.leetcode;

/**
 * Q1252
 * https://leetcode-cn.com/problems/cells-with-odd-values-in-a-matrix/
 */
public class Solution1252 {
    /**
     * 1 <= m, n <= 50
     * 1 <= indices.length <= 100
     * 0 <= r_i < m
     * 0 <= c_i < n
     */
    public int oddCells(int m, int n, int[][] indices) {
        long row = 0;
        long col = 0;
        for (int[] index : indices) {
            row ^= 1L << index[0];
            col ^= 1L << index[1];
        }
        int oddR = numOfOne(row);
        int oddC = numOfOne(col);
        return oddC * (m - oddR) + oddR * (n - oddC);
    }

    int numOfOne(long value) {
        int count = 0;
        while (value != 0) {
            count++;
            value &= value - 1;
        }
        return count;
    }
}
