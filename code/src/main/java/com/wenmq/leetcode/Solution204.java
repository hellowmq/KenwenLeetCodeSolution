package com.wenmq.leetcode;

/**
 * Q204
 * https://leetcode-cn.com/problems/count-primes/
 */
public class Solution204 {
    /**
     * 本质上的思想是压缩搜索空间
     */
    public int countPrimes(int n) {
        int result = 0;
        int sqrtN = (int) Math.sqrt(n);
        boolean[] b = new boolean[n];
        if (2 < n) result++;
        for (int i = 3; i < n; i += 2) {
            if (!b[i]) {
                if (i <= sqrtN) {
                    for (int j = i; i * j < n; j += 2) {
                        b[i * j] = true;    // 将当前质数的奇数倍都设置成非质数标记 true
                    }
                }
                result++;   // 质数个数 +1
            }
        }
        return result;
    }
}

