package com.wenmq.offer;

/**
 * Offer-4
 * 二维数组中的查找
 * 在一个 n * m 的二维数组中，
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Offer_4 {


    /**
     * 刀尖上行走，反对角线访问
     * 首先对于任意一个数 N，可以使用一条折现将有序矩阵划为左上右下两个区域；
     * 使得左上区域 都小于 N，右下区域都大于 N。
     * 因此可以在反对角线上寻找着这条折线，遍历到目标值则存在
     */
    static class Solution1 implements Solution {
        public boolean findNumberIn2DArray(int[][] matrix, int target) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return false;
            }
            int rows = matrix.length, columns = matrix[0].length;
            int row = 0, column = columns - 1;
            while (row < rows && column >= 0) {
                int num = matrix[row][column];
                if (num == target) {
                    return true;
                } else if (num > target) {
                    column--;
                } else {
                    row++;
                }
            }
            return false;
        }
    }

    interface Solution {
        public boolean findNumberIn2DArray(int[][] matrix, int target);
    }
}
