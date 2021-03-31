package com.wenmq.leetcode;

/**
 * Q304
 * https://leetcode-cn.com/problems/range-sum-query-2d-immutable/
 */
public class Solution304 {

    public static class NumMatrix implements Solution {

        int[][] array;

        public NumMatrix(int[][] matrix) {
            if (matrix.length == 0 || matrix[0].length == 0) {
                return;
            }
            int m = matrix.length + 1;
            int n = matrix[0].length + 1;
            array = new int[m][n];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    array[i + 1][j + 1] = matrix[i][j] + array[i][j + 1] + array[i + 1][j] - array[i][j];
                }
            }
        }

        @Override
        public int sumRegion(int row1, int col1, int row2, int col2) {
            return array[row2 + 1][col2 + 1] + array[row1][col1]
                    - array[row2 + 1][col1] - array[row1][col2 + 1];
        }
    }


    public static class NumMatrix2 implements Solution {

        int[][] array;

        public NumMatrix2(int[][] matrix) {
            int m = matrix.length + 1;
            int n = 1;
            if (m > 1) {
                n = matrix[0].length + 1;
            }
            array = new int[m][n];
            for (int i = 0; i < matrix.length; i++) {
                int sum = 0;
                for (int j = 0; j < matrix[i].length; j++) {
                    sum += matrix[i][j];
                    array[i + 1][j + 1] = array[i][j + 1] + sum;
                }
            }
        }

        @Override
        public int sumRegion(int row1, int col1, int row2, int col2) {
            return array[row2 + 1][col2 + 1] + array[row1][col1]
                    - array[row2 + 1][col1] - array[row1][col2 + 1];
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
