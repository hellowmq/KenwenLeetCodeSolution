package com.wenmq.cn.leetcode;

/**
 * Q1758
 * https://leetcode-cn.com/problems/minimum-changes-to-make-alternating-binary-string/
 */
public class Solution1758 {
    /**
     * 方法一：
     */
    public int minOperations(String s) {
        int count = 0;
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            if (((cs[i] ^ i) & 1) == 0) {
                count++;
            }
        }
        return Math.min(count, cs.length - count);
    }


}
