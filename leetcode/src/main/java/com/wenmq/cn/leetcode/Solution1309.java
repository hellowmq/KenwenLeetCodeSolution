package com.wenmq.cn.leetcode;

/**
 * Q1309
 * https://leetcode-cn.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
 */
public class Solution1309 {
    /**
     * 1 <= s.length <= 1000
     * s[i] 只包含数字（'0'-'9'）和 '#' 字符。
     * s 是映射始终存在的有效字符串。
     */
    public String freqAlphabets(String s) {
        char[] chars = s.toCharArray();
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 2 && chars[i + 2] == '#') {
                chars[index++] = (char) ('j' + (chars[i] - '1') * 10 + chars[i + 1] - '0');
                i += 2;
            } else {
                chars[index++] = (char) (chars[i] + ('a' - '1'));
            }
        }
        return String.valueOf(chars, 0, index);
    }

}
