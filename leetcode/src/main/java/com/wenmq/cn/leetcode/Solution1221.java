package com.wenmq.cn.leetcode;

/**
 * Q1221
 * https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/
 */
public class Solution1221 {
    /**
     * 1 <= s.length <= 1000
     * s[i] = 'L' 或 'R'
     * s 是一个 平衡 字符串
     */
    public int balancedStringSplit(String s) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                sum++;
            } else {
                sum--;
            }
            if (sum == 0) {
                count++;
            }
        }
        return count;
    }

}
