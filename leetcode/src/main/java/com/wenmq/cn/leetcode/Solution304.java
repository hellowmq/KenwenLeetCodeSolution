package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/range-sum-query-2d-immutable/">
 * Q304
 * </a>
 */
public class Solution304 {

    /**
     * m == matrix.length
     * n == matrix[i].length
     * 1 <= m, n <= 200
     * -10^5 <= matrix[i][j] <= 10^5
     * 0 <= row1 <= row2 < m
     * 0 <= col1 <= col2 < n
     * 最多调用 10^4 次 sumRegion 方法
     */
    public static class NumMatrix implements Solution {

        int[][] mMatrix;

        public NumMatrix(int[][] matrix) {
            if (matrix.length == 0 || matrix[0].length == 0) {
                return;
            }
            int m = matrix.length + 1;
            int n = matrix[0].length + 1;
            mMatrix = new int[m][n];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    mMatrix[i + 1][j + 1] =
                            matrix[i][j] + mMatrix[i][j + 1] + mMatrix[i + 1][j] - mMatrix[i][j];
                }
            }
        }

        @Override
        public int sumRegion(int row1, int col1, int row2, int col2) {
            return mMatrix[row2 + 1][col2 + 1] + mMatrix[row1][col1]
                    - mMatrix[row2 + 1][col1] - mMatrix[row1][col2 + 1];
        }
    }


    public static class NumMatrix2 implements Solution {

        int[][] mMatrix;

        public NumMatrix2(int[][] matrix) {
            int m = matrix.length + 1;
            int n = 1;
            if (m > 1) {
                n = matrix[0].length + 1;
            }
            mMatrix = new int[m][n];
            for (int i = 0; i < matrix.length; i++) {
                int sum = 0;
                for (int j = 0; j < matrix[i].length; j++) {
                    sum += matrix[i][j];
                    mMatrix[i + 1][j + 1] = mMatrix[i][j + 1] + sum;
                }
            }
        }

        @Override
        public int sumRegion(int row1, int col1, int row2, int col2) {
            return mMatrix[row2 + 1][col2 + 1] + mMatrix[row1][col1]
                    - mMatrix[row2 + 1][col1] - mMatrix[row1][col2 + 1];
        }
    }

    /**
     * Your NumMatrix object will be instantiated and called as such:
     * NumMatrix obj = new NumMatrix(matrix);
     * int param_1 = obj.sumRegion(row1,col1,row2,col2);
     */
    interface Solution {
        int sumRegion(int row1, int col1, int row2, int col2);
    }

}
