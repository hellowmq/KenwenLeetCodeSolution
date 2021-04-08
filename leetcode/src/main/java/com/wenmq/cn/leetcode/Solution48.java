package com.wenmq.cn.leetcode;

/**
 * Q48
 * https://leetcode-cn.com/problems/rotate-image/
 */
public class Solution48 {
    /**
     * 这里的一种想法是把旋转分解为镜像和反序
     * 这里主要是抽出了两个其他题的工具方法
     */
    public void rotate(int[][] matrix) {
        mirrorSymmetry(matrix);
        int length = matrix.length;
        for (int[] ints : matrix) {
            reverse(ints, 0, length - 1);
        }
    }

    public void mirrorSymmetry(int[][] matrix) {
        int length = matrix.length;
        int temp;
        if (length == 1) {
            return;
        }
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }


    public void reverse(int[] nums, int start, int end) {
        int temp;
        if (start < 0) {
            return;
        }
        if (end + 1 > nums.length) {
            return;
        }
        while (start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


    public void rotate2(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            int[] tmp = matrix[i];
            matrix[i] = matrix[matrix.length - 1 - i];
            matrix[matrix.length - 1 - i] = tmp;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }
}
