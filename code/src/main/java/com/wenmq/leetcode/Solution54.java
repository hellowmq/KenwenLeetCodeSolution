package com.wenmq.leetcode;

import com.wenmq.algo.array.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Q54
 * https://leetcode-cn.com/problems/spiral-matrix/
 */
public class Solution54 {
    /**
     * 利用定点指针作为约束
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        if (m == 0) {
            return Collections.emptyList();
        }
        int n = matrix[0].length;
        if (n == 0) {
            return Collections.emptyList();
        }
        int left = 0;
        int top = 0;
        int right = n - 1;
        int bottom = m - 1;
        Integer[] result = new Integer[m * n];
        int index = 0;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right && top <= bottom; i++) {
                result[index++] = matrix[top][i];
            }
            top++;
            for (int i = top; left <= right && i <= bottom; i++) {
                result[index++] = matrix[i][right];
            }
            right--;
            for (int i = right; i >= left && top <= bottom; i--) {
                result[index++] = matrix[bottom][i];
            }
            bottom--;
            for (int i = bottom; left <= right && i >= top; i--) {
                result[index++] = matrix[i][left];
            }
            left++;
        }
        return Arrays.asList(result);
    }
}
