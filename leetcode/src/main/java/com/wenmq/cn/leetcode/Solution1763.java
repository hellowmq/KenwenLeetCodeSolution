package com.wenmq.cn.leetcode;

/**
 * Q1763
 * https://leetcode-cn.com/problems/longest-nice-substring/
 */
public class Solution1763 {
    /**
     * 1 <= s.length <= 100
     * s 只包含大写和小写英文字母。
     */
    public String longestNiceSubstring(String s) {
        int len = s.length();
        char[] chars = s.toCharArray();

        String ans = "";
        for (int i = 0; i < len; i++) {
            int high = 0;
            int low = 0;
            for (int j = i; j < len; j++) {
                char c = chars[j];
                // 用位运算记录字符出现次数
                if (c >= 'a' && c <= 'z') {
                    high |= 1 << (c - 'a');
                } else {
                    low |= 1 << (c - 'A');
                }
                if (high == low && (j - i + 1) > ans.length()) {
                    // 找到了,更长的
                    ans = s.substring(i, j + 1);
                }
            }
        }
        return ans;
    }

}
