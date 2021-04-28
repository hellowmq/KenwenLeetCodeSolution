package com.wenmq.cn.leetcode;

/**
 * Q633
 * https://leetcode-cn.com/problems/sum-of-square-numbers/
 */
public class Solution633 {
    /**
     * 方法一：
     */
    public boolean judgeSquareSum(int c) {
        if (c <= 1) {
            return true;
        }
        int l = 0;
        int r = (int) Math.sqrt(c);
        while (l <= r) {
            int sum = l * l + r * r;
            if (sum == c) {
                return true;
            }
            if (sum < c) {
                l++;
            } else {
                r--;
            }
        }
        return false;
    }

    public boolean judgeSquareSum2(int c) {
        int lowerBound = (int) Math.sqrt(c >> 1);
        int upperBound = (int) Math.sqrt(c);
        for (int i = lowerBound; i <= upperBound; i++) {
            int a = c - i * i;
            int sqrt = (int) Math.sqrt(a);
            if (sqrt * sqrt == a) {
                return true;
            }
        }
        return false;
    }

}
