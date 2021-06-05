package com.wenmq.cn.leetcode;

/**
 * Q1317
 * https://leetcode-cn.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/
 */
public class Solution1317 {
    /**
     * 2 <= n <= 10^4
     */
    public int[] getNoZeroIntegers(int n) {
        int a = n >> 1;
        while (a > 0) {
            if (noZero(a) && noZero(n - a)) {
                return new int[]{a, n - a};
            }
            a--;
        }
        return null;
    }

    private static boolean noZero(int n) {
        while (n > 0) {
            if (n % 10 == 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

}
