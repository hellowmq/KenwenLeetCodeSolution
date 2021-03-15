package com.wenmq.leetcode;

import java.util.AbstractList;
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
        if (m == 0 || matrix[0].length == 0) {
            return java.util.Collections.emptyList();
        }
        int n = matrix[0].length;

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
        return new A(result);
    }

    static class A extends java.util.AbstractList<Integer> {
        Integer[] array;

        public A(Integer[] array) {
            this.array = array;
        }

        @Override
        public Integer get(int index) {
            return array[index];
        }

        @Override
        public int size() {
            return array.length;
        }
    }

}
