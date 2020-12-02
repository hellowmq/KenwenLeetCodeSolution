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
            if (b[i]) continue;
            if (i <= sqrtN) {
                int temp = i * i;
                for (int j = i; temp < n; j += 2, temp = i * j) {
                    b[temp] = true;
                }
            }
            result++;   // 质数个数 +1
        }
        return result;
    }


    public int countPrimes2(int n) {
        if (n < 3) {
            return 0;
        }
        boolean[] f = new boolean[n];
        int count = n / 2;
        for (int i = 3; i * i < n; i += 2) {
            if (f[i]) {
                continue;
            }
            for (int j = i * i; j < n; j += 2 * i) {
                if (!f[j]) {
                    --count;
                    f[j] = true;
                }
            }
        }
        return count;
    }
}

