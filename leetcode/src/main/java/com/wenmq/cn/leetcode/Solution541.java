package com.wenmq.cn.leetcode;

/**
 * <a href="https://leetcode-cn.com/problems/reverse-string-ii/">
 * Q541
 * </a>
 */
public class Solution541 {
    /**
     * 1 <= s.length <= 10^4
     * s 仅由小写英文组成
     * 1 <= k <= 10^4
     */
    public String reverseStr(String s, int k) {
        final char[] chars = s.toCharArray();
        final int mod = k << 1;
        for (int start = 0; start < chars.length; start += mod) {
            reverseCharBetween(chars, start, Math.min(start + k, chars.length) - 1);
        }
        return String.valueOf(chars);
    }

    /**
     * 优化 for 循环调用
     */
    private void reverseCharBetween(char[] chars, int i, int j) {
        while (i < j) {
            char tmp = chars[i];
            chars[i++] = chars[j];
            chars[j--] = tmp;
        }
    }
}
