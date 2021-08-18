package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/replace-all-digits-with-characters/">
 * Q1884
 * </a>
 */
public class Solution1884 {
    /**
     * 1 <= s.length <= 100
     * s 只包含小写英文字母和数字。
     * 对所有 奇数 下标处的 i ，满足 shift(s[i-1], s[i]) <= 'z' 。
     */
    public String replaceDigits(String s) {
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i += 2) {
            chars[i] += chars[i - 1] - '0';
        }
        return String.valueOf(chars);
    }
}
