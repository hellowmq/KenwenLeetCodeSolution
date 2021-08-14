package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/three-divisors/">
 * Q1952
 * </a>
 */
public class Solution1952 {

    static int[] sPrimes = {
            2, 3, 5, 7, 11,
            13, 17, 19, 23, 29,
            31, 37, 41, 43, 47,
            53, 59, 61, 67, 71,
            73, 79, 83, 89, 97
    };

    /**
     * 1 <= n <= 10^4
     * 因数只有奇数个的数一定是完全平方数，这个问题就等价于一个数是否质数的平方。
     */
    public boolean isThree(int n) {
        for (int sqr : sPrimes) {
            if (sqr * sqr == n) {
                return true;
            }
        }
        return false;
    }

}
