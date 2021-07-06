package com.wenmq.cn.leetcode;

/**
 * Q661
 * https://leetcode-cn.com/problems/image-smoother/
 */
public class Solution661 {

    /**
     * 给定矩阵中的整数范围为 [0, 255]。
     * 矩阵的长和宽的范围均为 [1, 150]。
     * 极致的空间复用，修改原数组
     */
    public int[][] imageSmoother(int[][] img) {
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[i].length; j++) {
                int a = countByRow(img, i, j);
                img[i][j] |= a << 16;
            }
        }
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[i].length; j++) {
                img[i][j] >>= 16;
            }
        }
        return img;
    }

    private static int countByRow(int[][] img, int i, int j) {
        final short[] a = new short[2];
        countByCol(img, i, j, a);
        if (i > 0) {
            countByCol(img, i - 1, j, a);
        }
        if (i < img.length - 1) {
            countByCol(img, i + 1, j, a);
        }
        return a[1] / a[0];
    }

    private static void countByCol(int[][] img, int i, int j, short[] a) {
        a[1] += img[i][j];
        a[0]++;
        if (j > 0) {
            a[1] += img[i][j - 1];
            a[0]++;
        }
        if (j < img[i].length - 1) {
            a[1] += img[i][j + 1];
            a[0]++;
        }
    }


    /**
     * 看上去这个耗时更短，可能存在编译器优化的情况
     */
    public int[][] imageSmoother2(int[][] img) {
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[i].length; j++) {
                int a = getCenterResult(img, i, j);
                img[i][j] |= a << 16;
            }
        }
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[i].length; j++) {
                img[i][j] >>= 16;
            }
        }
        return img;
    }

    private static int getCenterResult(int[][] img, int i, int j) {
        short result = (short) img[i][j];
        int count = 1;
        final boolean iBottom = i > 0;
        final boolean iTop = i < img.length - 1;
        final boolean jBottom = j > 0;
        final boolean jTop = j < img[i].length - 1;
        if (iBottom) {
            if (jBottom) {
                result += img[i - 1][j - 1];
                count++;
            }
            result += img[i - 1][j];
            count++;
            if (jTop) {
                result += img[i - 1][j + 1];
                count++;
            }
        }
        if (jBottom) {
            result += img[i][j - 1];
            count++;
        }
        if (jTop) {
            result += img[i][j + 1];
            count++;
        }
        if (iTop) {
            if (jBottom) {
                result += img[i + 1][j - 1];
                count++;
            }
            result += img[i + 1][j];
            count++;
            if (jTop) {
                result += img[i + 1][j + 1];
                count++;
            }
        }
        return result / count;
    }
}