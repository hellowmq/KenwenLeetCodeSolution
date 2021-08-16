package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/number-of-equivalent-domino-pairs/">
 * Q1128
 * </a>
 */
public class Solution1128 {

    /**
     * 1 <= dominoes.length <= 40000
     * 1 <= dominoes[i][j] <= 9
     */
    public int numEquivDominoPairs(int[][] dominoes) {
        int count = 0;
        if (dominoes.length <= 1) {
            return count;
        }
        int[][] array = new int[10][10];
        for (int[] d : dominoes) {
            array[d[0]][d[1]]++;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[i].length; j++) {
                if (i < j) {
                    array[i][j] += array[j][i];
                }
                if (array[i][j] > 1) {
                    count += array[i][j] * (array[i][j] - 1) >> 1;
                }
            }
        }
        return count;
    }

    public int numEquivDominoPairs2(int[][] dominoes) {
        int[] array = new int[100];
        for (int[] d : dominoes) {
            array[d[0] + d[1] + 9 * Math.max(d[0], d[1])]++;
        }
        int count = 0;
        for (int a : array) {
            if (a > 1) {
                count += a * (a - 1) >> 1;
            }
        }
        return count;
    }


}
