package com.wenmq.cn.leetcode;

/**
 * Q1684
 * https://leetcode-cn.com/problems/count-the-number-of-consistent-strings/
 */
public class Solution1684 {
    /**
     * 方法一：
     */
    public int countConsistentStrings(String allowed, String[] words) {
        int filter = 0;
        int length = allowed.length();
        for (int i = 0; i < length; i++) {
            filter |= 1 << (allowed.charAt(i) - 'a');
        }
        filter = ~filter;
        int count = words.length;
        for (String word : words) {
            int length1 = word.length();
            for (int i = 0; i < length1; i++) {
                if ((filter & (1 << (word.charAt(i) - 'a'))) != 0) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }

}
