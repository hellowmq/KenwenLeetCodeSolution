package com.wenmq.cn.leetcode;

/**
 * Q441
 * https://leetcode-cn.com/problems/arranging-coins/
 */
public class Solution441 {
    /**
     * k * (k + 1)
     */
    public int arrangeCoins(int n) {
        return (int) (Math.sqrt(2) * Math.sqrt(n + 0.125) - 0.5);
    }

    public int arrangeCoins2(int n) {
        long sqrt = (long) (Math.sqrt((long) n << 1));
        long i = sqrt * (sqrt + 1);
        return i / 2 > n ? (int) sqrt - 1 : (int) sqrt;
    }
}

