package com.wenmq.cn.leetcode;

/**
 * Q1725
 * https://leetcode-cn.com/problems/number-of-rectangles-that-can-form-the-largest-square/
 */
public class Solution1725 {
    /**
     * 遍历存储一个最大值即可
     */
    public int countGoodRectangles(int[][] rectangles) {
        int count = 0;
        int maxLen = 0;
        for (int[] pair : rectangles) {
            int len = Math.min(pair[0], pair[1]);
            if (len > maxLen) {
                count = 1;
                maxLen = len;
            } else if (len == maxLen) {
                count++;
            }
        }
        return count;
    }

}
