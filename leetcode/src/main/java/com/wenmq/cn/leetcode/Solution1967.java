package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/number-of-strings-that-appear-as-substrings-in-word/">
 * Q1967
 * </a>
 */
public class Solution1967 {
    /**
     * 1 <= patterns.length <= 100
     * 1 <= patterns[i].length <= 100
     * 1 <= word.length <= 100
     * patterns[i] 和 word 由小写英文字母组成
     */
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String str : patterns) {
            if (word.contains(str)) {
                count++;
            }
        }
        return count;
    }

}
