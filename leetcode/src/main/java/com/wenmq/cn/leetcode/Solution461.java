package com.wenmq.cn.leetcode;

/**
 * Q461
 * https://leetcode-cn.com/problems/hamming-distance/
 */
public class Solution461 {
    /**
     * 0 <= x, y <= 2^31 - 1
     */
    public int hammingDistance(int x, int y) {
        int a = x ^ y;
        int sum = 0;
        while (a != 0) {
            a &= a - 1;
            sum++;
        }
        return sum;
    }

}
