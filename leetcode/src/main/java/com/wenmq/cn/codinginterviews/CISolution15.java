package com.wenmq.cn.codinginterviews;

/**
 * Q15
 * https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/
 */
public class CISolution15 {
    /**
     * you need to treat n as an unsigned value
     * 输入必须是长度为 32 的 二进制串 。
     */
    public int hammingWeight(int n) {
        int hammingWeightCount = 0;
        while (n != 0) {
            n &= (n - 1);
            hammingWeightCount++;
        }
        return hammingWeightCount;
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
