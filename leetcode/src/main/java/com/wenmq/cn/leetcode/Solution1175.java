package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/prime-arrangements/">
 * Q1175
 * </a>
 */
public class Solution1175 {
    public static final long MOD = 1000000007;
    static int[] sPrimeArray = new int[]{
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
    };

    /**
     * 1 <= n <= 100
     */
    public int numPrimeArrangements(int n) {
        int primeCount = getPrimeCount(n);
        long ans = 1;
        ans = multiplyA(primeCount, ans);
        ans = multiplyA(n - primeCount, ans);
        return (int) (ans % MOD);
    }

    private long multiplyA(int primeCount, long ans) {
        for (int i = primeCount; i > 1; i--) {
            ans *= i;
            ans %= MOD;
        }
        return ans;
    }

    private int getPrimeCount(int n) {
        int count = 0;
        for (int c : sPrimeArray) {
            if (n >= c) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
