package com.wenmq.leetcode;

/**
 * Q74
 * https://leetcode-cn.com/problems/search-a-2d-matrix/
 */
public class Solution74 {
    /**
     *
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int low = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int high = row * col - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = matrix[mid / col][mid % col];

            if (midVal < target) {
                low = mid + 1;
            } else if (midVal > target) {
                high = mid - 1;
            } else {
                return true; // key found
            }
        }
        return false;  // key not found.


    }


}
