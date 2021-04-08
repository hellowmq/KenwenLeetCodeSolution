package com.wenmq.cn.leetcode;

/**
 * Q73
 * https://leetcode-cn.com/problems/set-matrix-zeroes/
 */
public class Solution73 {

    /**
     * 使用首行首列作为存储
     */
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstRow = false;
        boolean fistCol = false;
        for (int num : matrix[0]) {
            if (num == 0) {
                firstRow = true;
                break;
            }
        }
        for (int[] ints : matrix) {
            if (ints[0] == 0) {
                fistCol = true;
                break;
            }
        }

        //标记
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] != 0) {
                    continue;
                }
                matrix[i][0] = 0;
                matrix[0][j] = 0;
            }
        }


        //置零
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] != 0 && matrix[0][j] != 0) {
                    continue;
                }
                matrix[i][j] = 0;
            }
        }

        if (firstRow) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        if (fistCol) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
