package com.wenmq.cn.leetcode;

/**
 * Q191
 * https://leetcode-cn.com/problems/number-of-1-bits/submissions/
 */
public class Solution191 {

    /**
     * n & (n-1) 的特殊性质：
     * 取出最低位的 1
     */
    public int hammingWeight(int n) {
        int ans = 0;
        while (n != 0) {
            ans++;
            n &= n - 1;
        }
        return ans;
    }

    /**
     * 面向测试用例编程
     * 和方法一是没有差别的，
     * 但测试用例大多数有大量的 1 和少量的 0
     * 所以先取反更快一点
     */
    public int hammingWeight2(int n) {
        int ans = 32;
        int k = ~n;
        while (k != 0) {
            ans--;
            k &= k - 1;
        }
        return ans;
    }


}
