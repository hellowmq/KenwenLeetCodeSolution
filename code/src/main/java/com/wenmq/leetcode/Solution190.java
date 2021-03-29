package com.wenmq.leetcode;

/**
 * Q190
 * https://leetcode-cn.com/problems/reverse-bits/
 */
public class Solution190 {
    /**
     * you need treat n as an unsigned value
     */
    public int reverseBits(int n) {
        int ans = 0;
        for (int bitsSize = 31; n != 0; bitsSize--) {
            ans += (n & 1) << bitsSize;
            n = n >>> 1;
        }
        return ans;
    }

}
