package com.wenmq.cn.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Q1260
 * https://leetcode-cn.com/problems/shift-2d-grid/
 */
public class Solution1260 {
    /**
     * m == grid.length
     * n == grid[i].length
     * 1 <= m <= 50
     * 1 <= n <= 50
     * -1000 <= grid[i][j] <= 1000
     * 0 <= k <= 100
     */
    @SuppressWarnings({"rawtypes", "unchecked", "UnnecessaryLocalVariable"})
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return new ArrayList<>();
        }
        int m = grid.length;
        int n = grid[0].length;
        int mod = m * n;
        k %= mod;
        k = (mod - k) % mod;
        reverse(grid, 0, k - 1);
        reverse(grid, k, mod - 1);
        reverse(grid, 0, mod - 1);
        List ts = Arrays.asList(grid);
        return ts;
    }


    void reverse(int[][] grid, int from, int end) {
        int n = grid[0].length;
        while (from < end) {
            int temp = grid[from / n][from % n];
            grid[from / n][from % n] = grid[end / n][end % n];
            grid[end / n][end % n] = temp;
            from++;
            end--;
        }
    }

    /**
     * 计算出 index，加上偏移量再 add 到 list 中
     */
    public List<List<Integer>> shiftGrid2(int[][] grid, int k) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return new ArrayList<>();
        }
        int m = grid.length;
        int n = grid[0].length;
        int mod = m * n;
        k %= mod;
        k = (mod - k) % mod;
        List<List<Integer>> list = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            List<Integer> l = new ArrayList<>(n);
            for (int j = 0; j < n; j++) {
                l.add(grid[k / n][k % n]);
                k++;
                k %= mod;
            }
            list.add(l);
        }
        return list;
    }
}
