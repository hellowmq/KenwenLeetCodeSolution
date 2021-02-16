package com.wenmq.leetcode;

/**
 * Q566
 * https://leetcode-cn.com/problems/reshape-the-matrix/
 */
public class Solution566 {
    /**
     * 方法一：
     */
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int rr = nums.length;
        int cc = nums[0].length;
        if (rr * cc != r * c) return nums;
        int[][] array = new int[r][c];
        int bias = 0;
        for (int[] row : nums) {
            for (int col : row) {
                array[bias / c][bias % c] = col;
                bias++;
            }
        }
        return array;
    }

}
