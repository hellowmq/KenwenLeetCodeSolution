package com.wenmq.cn.leetcode;

/**
 * Q1446
 * https://leetcode-cn.com/problems/consecutive-characters/
 */
public class Solution1446 {
    /**
     * 使用一个临时变量进行更新即可
     */
    public int maxPower(String s) {
        char cur = ' ';
        int max = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (cur == s.charAt(i)) {
                count++;
            } else {
                cur = s.charAt(i);
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }

}
