package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/check-if-all-characters-have-equal-number-of-occurrences/">
 * Q1941
 * </a>
 */
public class Solution1941 {
    /**
     * 1 <= s.length <= 1000
     * s 只包含小写英文字母。
     */
    public boolean areOccurrencesEqual(String s) {
        int[] set = new int[26];
        for (int i = 0; i < s.length(); i++) {
            set[s.charAt(i) - 'a']++;
        }
        int firstCount = 0;
        for (int count : set) {
            if (count != 0) {
                if (firstCount == 0) {
                    firstCount = count;
                } else if (firstCount != count) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * char 数组
     */
    public boolean areOccurrencesEqual2(String s) {
        char[] chars = s.toCharArray();
        int[] set = new int[26];
        for (char c : chars) {
            set[c - 'a']++;
        }
        int firstCount = 0;
        for (int count : set) {
            if (count != 0) {
                if (firstCount == 0) {
                    firstCount = count;
                } else if (firstCount != count) {
                    return false;
                }
            }
        }
        return true;
    }

}
