package com.wenmq.cn.leetcode;

/**
 * Q1351
 * https://leetcode-cn.com/problems/count-negative-numbers-in-a-sorted-matrix/
 */
public class Solution1351 {
    /**
     * 矩阵分割线形成折线，模拟这个折线
     */
    public int countNegatives(int[][] grid) {
        int len = grid[0].length;
        int i = grid.length - 1;
        int j = 0;
        int sum = 0;
        while (i >= 0 && j < len) {
            if (grid[i][j] >= 0) {
                j++;
            } else {
                i--;
                sum += len - j;
            }
        }
        return sum;
    }

}
