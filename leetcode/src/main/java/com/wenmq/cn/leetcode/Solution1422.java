package com.wenmq.cn.leetcode;

/**
 * Q1422
 * https://leetcode-cn.com/problems/maximum-score-after-splitting-a-string/
 */
public class Solution1422 {
    /**
     * 第一次循环计算出起始点所有的 1
     * 对应以最左边为边界
     * 遍历时更新 score
     */
    public int maxScore(String s) {
        int score = 0;
        for (int i = 0; i < s.length(); i++) {
            score += s.charAt(i) - '0';
        }
        int max = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if ('1' == s.charAt(i)) {
                score--;
            } else {
                score++;
            }
            max = Math.max(max, score);
        }
        return max;
    }
}
