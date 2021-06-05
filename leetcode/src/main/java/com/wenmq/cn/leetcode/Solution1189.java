package com.wenmq.cn.leetcode;

/**
 * Q1189
 * https://leetcode-cn.com/problems/maximum-number-of-balloons/
 */
public class Solution1189 {
    /**
     * 统计字符数
     */
    public int maxNumberOfBalloons(String text) {
        int[] set = new int[26];
        for (int i = 0; i < text.length(); i++) {
            set[text.charAt(i) - 'a']++;
        }

        int min = set['n' - 'a'];
        int min1 = Math.min(set[0], set[1]);
        int min2 = Math.min(set['l' - 'a'] >> 1, set['o' - 'a'] >> 1);
        return Math.min(min, Math.min(min1, min2));
    }

}
