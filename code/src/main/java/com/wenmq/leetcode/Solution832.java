package com.wenmq.leetcode;

/**
 * Q832
 * https://leetcode-cn.com/problems/flipping-an-image/
 */
public class Solution832 {

    public int[][] flipAndInvertImage(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < ((n + 1) >> 1); j++) {
                int temp = A[i][j] ^ 1;
                A[i][j] = A[i][n - 1 - j] ^ 1;
                A[i][n - 1 - j] = temp;
            }
        }
        return A;
    }


    public int[][] flipAndInvertImage2(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int length = A[i].length;
            for (int j = 0; j * 2 < length; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][length - 1 - j];
                A[i][length - 1 - j] = temp;
            }
        }
        for (int i = 0; i < A.length; i++) {
            int length = A[i].length;
            for (int j = 0; j < length; j++) {
                A[i][j] = (A[i][j] ^ 1);
            }

        }
        return A;
    }


}
