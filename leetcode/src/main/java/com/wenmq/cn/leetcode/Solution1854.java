package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/maximum-population-year/">
 * Q1854
 * </a>
 */
public class Solution1854 {

    public static final int BASE = 1950;

    /**
     * 1 <= logs.length <= 100
     * 1950 <= birth_i < death_i <= 2050
     */
    public int maximumPopulation(int[][] logs) {
        int[] array = new int[101];
        for (int[] log : logs) {
            array[log[0] - BASE]++;
            array[log[1] - BASE]--;
        }
        int cur = 0;
        int max = 0;
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            cur += array[i];
            if (cur > count) {
                count = cur;
                max = i;
            }
        }
        return max + 1950;

    }

}
