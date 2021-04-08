package com.wenmq.cn.leetcode;

/**
 * Q343
 * https://leetcode-cn.com/problems/integer-break/
 */
public class Solution343 {

    /**
     * 3 > 1 * 2
     * 2 * 2 = 4 > 1 * 3
     * 2 * 3 > 5 > 1 * 4
     * 3 * 3 > 2 * 2 * 2
     */
    public int integerBreak(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int a = n / 3;
        int b = n % 3;
        if (b == 0) {
            return (int) Math.pow(3, a);
        }
        if (b == 1) {
            return (int) Math.pow(3, a - 1) * 4;
        }
        return (int) Math.pow(3, a) * 2;
    }

    public int integerBreak2(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int a = 1;
        while (n > 4) {
            n -= 3;
            a = a * 3;
        }
        return a * n;
    }


}
