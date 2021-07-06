package com.wenmq.cn.leetcode;

/**
 * Q709
 * https://leetcode-cn.com/problems/to-lower-case/
 */
public class Solution709 {
    /**
     * 1 <= s.length <= 100
     * s 由 ASCII 字符集中的可打印字符组成
     */
    public String toLowerCase(String s) {
        // Emm
        return s.toLowerCase();
    }

    public String toLowerCase2(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.toLowerCase(chars[i]);
        }
        return String.valueOf(chars);
    }

    public String toLowerCase3(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] |= 0x20;
            }
        }
        return String.valueOf(chars);
    }
}
