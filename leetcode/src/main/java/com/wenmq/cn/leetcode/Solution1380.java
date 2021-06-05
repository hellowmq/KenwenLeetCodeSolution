package com.wenmq.cn.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Q1380
 * https://leetcode-cn.com/problems/lucky-numbers-in-a-matrix/
 */
public class Solution1380 {
    /**
     * m == mat.length
     * n == mat[i].length
     * 1 <= n, m <= 50
     * 1 <= matrix[i][j] <= 10^5
     * 矩阵中的所有元素都是不同的
     * 使用数组
     */
    public List<Integer> luckyNumbers(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }
        // i
        int[] row = new int[matrix[0].length];
        // j
        int[] col = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[row[j]][j] < matrix[i][j]) {
                    row[j] = i;
                }
                if (matrix[i][col[i]] > matrix[i][j]) {
                    col[i] = j;
                }
            }
        }
        long[] set = new long[64];
        for (int j = 0; j < row.length; j++) {
            set[row[j]] |= 1 << j;
        }
        List<Integer> list = new ArrayList<>(matrix.length);
        for (int i = 0; i < col.length; i++) {
            if ((set[i] & (1 << col[i])) != 0) {
                list.add(matrix[i][col[i]]);
            }
        }
        return list;
    }

    /**
     * 使用集合
     */
    public List<Integer> luckyNumbers2(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }
        // i
        int[] row = new int[matrix[0].length];
        // j
        int[] col = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[row[j]][j] < matrix[i][j]) {
                    row[j] = i;
                }
                if (matrix[i][col[i]] > matrix[i][j]) {
                    col[i] = j;
                }
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int j = 0; j < row.length; j++) {
            set.add(matrix[row[j]][j]);
        }
        List<Integer> list = new ArrayList<>(matrix.length);
        for (int i = 0; i < col.length; i++) {
            if (set.contains(matrix[i][col[i]])) {
                list.add(matrix[i][col[i]]);
            }
        }
        return list;

    }

}
