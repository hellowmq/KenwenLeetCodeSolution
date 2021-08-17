package com.wenmq.cn.leetcode;

import java.util.Arrays;

/**
 * <a href="https://leetcode-cn.com/problems/n-th-tribonacci-number/">
 * Q1137
 * </a>
 */
public class Solution1137 {

    static int[] sTribonacci = new int[38];

    static {
        sTribonacci[0] = 0;
        sTribonacci[1] = 1;
        sTribonacci[2] = 1;
        for (int i = 3; i < sTribonacci.length; i++) {
            sTribonacci[i] = sTribonacci[i - 1] + sTribonacci[i - 2] + sTribonacci[i - 3];
        }
    }

    /**
     * 0 <= n <= 37
     * 答案保证是一个 32 位整数，即 answer <= 2^31 - 1。
     */
    public int tribonacci(int n) {
        return sTribonacci[n];
    }

    public int tribonacci2(int n) {
        int[] ints = new int[n + 3];
        ints[2] = ints[1] = 1;
        for (int i = 3; i <= n; i++) {
            ints[i] = ints[i - 1] + ints[i - 2] + ints[i - 3];
        }
        return ints[n];
    }

}
