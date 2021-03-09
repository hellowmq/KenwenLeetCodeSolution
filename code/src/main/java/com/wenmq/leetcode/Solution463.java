package com.wenmq.leetcode;

/**
 * Q463
 * https://leetcode-cn.com/problems/island-perimeter/
 */
public class Solution463 {
    /**
     * 方法一：
     * - 先假定每个正方形都有四条边
     * - 减去相邻的正方形减少两条边
     */
    public int islandPerimeter(int[][] grid) {
        int numSquare = 0;
        int noSide = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] <= 0) {
                    continue;
                }
                numSquare++;
                if (i > 0 && grid[i][j] + grid[i - 1][j] == 2) {
                    noSide++;
                }
                if (j > 0 && grid[i][j] + grid[i][j - 1] == 2) {
                    noSide++;
                }
            }
        }
        return ((numSquare << 1) - noSide) << 1;
    }

}
