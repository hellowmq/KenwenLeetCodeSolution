package com.wenmq.leetcode;

/**
 * Q861
 * https://leetcode-cn.com/problems/score-after-flipping-matrix/
 */
public class Solution861 {
    /**
     * 个人认为最佳
     * 时间O(MN)
     * 空间O(1)
     */
    public int matrixScore(int[][] A) {
        int sum = 0;
        if (A == null) return sum;
        for (int i = 0; i < A[0].length; i++) {
            int numOfOne = 0;
            for (int[] ints : A) {
                if (ints[i] == 1 ^ ints[0] == 0) {
                    numOfOne++;
                }
            }
            sum += Math.max(numOfOne, A.length - numOfOne) << (A[0].length - i - 1);
        }
        return sum;
    }

    /**
     * 一开始写出了这个，后边发现很多可以精简
     */
    public int matrixScore2(int[][] A) {
        int sum = 0;
        if (A == null) return sum;
        boolean[] first = new boolean[20];
        for (int i = 0; i < A.length; i++) {
            first[i] = A[i][0] == 0;
        }
        int bias = 1 << A[0].length;
        for (int i = 0; i < A[0].length; i++) {
            bias = bias >> 1;
            int left = 0;
            int right = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[j][i] == 1 ^ first[j]) {
                    left++;
                } else {
                    right++;
                }
            }
            sum += Math.max(left, right) * bias;
        }
        return sum;
    }

}
