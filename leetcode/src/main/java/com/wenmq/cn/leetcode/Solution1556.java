package com.wenmq.cn.leetcode;

/**
 * Q1556
 * https://leetcode-cn.com/problems/thousand-separator/
 */
public class Solution1556 {
    /**
     * 0 <= n < 2^31
     */
    public String thousandSeparator(int n) {
        if (n < 1000) {
            return String.valueOf(n);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        for (int i = sb.length() - 3; i > 0; ) {
            sb.insert(i, '.');
            i -= 3;
        }
        return sb.toString();
    }

}
