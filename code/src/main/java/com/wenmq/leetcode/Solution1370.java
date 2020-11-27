package com.wenmq.leetcode;

/**
 * Q1370
 * https://leetcode-cn.com/problems/increasing-decreasing-string/
 */
public class Solution1370 {
    /**
     * 方法一：
     */
    public String sortString(String s) {
        int[] buckets = new int[26];
        for (char c : s.toCharArray()) {
            buckets[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() != s.length()) {
            for (int i = 0; i < 26; i++) {
                if (buckets[i] == 0) {
                    continue;
                }
                sb.append((char) (i + 'a'));
                buckets[i]--;
            }
            for (int i = 25; i >= 0; i--) {
                if (buckets[i] == 0) {
                    continue;
                }
                sb.append((char) (i + 'a'));
                buckets[i]--;
            }
        }
        return sb.toString();
    }
}
