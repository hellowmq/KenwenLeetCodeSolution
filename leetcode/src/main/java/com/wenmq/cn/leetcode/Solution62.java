package com.wenmq.cn.leetcode;

import java.util.Arrays;

/**
 * Q62
 * https://leetcode-cn.com/problems/unique-paths/
 */
public class Solution62 {
    /**
     * 方法一：
     */
    public int uniquePaths(int m, int n) {
        int[] cur = new int[n];
        Arrays.fill(cur, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                cur[j] += cur[j - 1];
            }
        }
        return cur[n - 1];
    }

    public int uniquePaths2(int m, int n) {
        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }
        int[] cur = new int[n];
        Arrays.fill(cur, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                cur[j] += cur[j - 1];
            }
        }
        return cur[n - 1];
    }


//    /**
//     * 直接计算组合数 C(m + n - 2, m - 1)
//     * 有溢出风险
//     */
//    public int uniquePaths3(int m, int n) {
//        return 0;
//    }


}
