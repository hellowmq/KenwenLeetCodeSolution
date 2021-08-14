package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/check-if-string-is-a-prefix-of-array/">
 * Q1961
 * </a>
 */
public class Solution1961 {
    /**
     * 1 <= words.length <= 100
     * 1 <= words[i].length <= 20
     * 1 <= s.length <= 1000
     * words[i] 和 s 仅由小写英文字母组成
     * String builder
     */
    public boolean isPrefixString(String s, String[] words) {
        int i = 0;
        StringBuilder sb = new StringBuilder(s.length());
        while (i < words.length) {
            sb.append(words[i]);
            if (s.startsWith(sb.toString())) {
                if (s.equals(sb.toString())) {
                    return true;
                }
            } else {
                break;
            }
            i++;
        }
        return false;
    }


    /**
     * 使用 char 检查
     */
    public boolean isPrefixString2(String s, String[] words) {
        int index = 0;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == s.charAt(index)) {
                    index++;
                } else {
                    return false;
                }
                if (index >= s.length()) {
                    return i == word.length() - 1;
                }
            }
        }
        return false;
    }
}
