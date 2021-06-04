package com.wenmq.cn.leetcode;

/**
 * Q1417
 * https://leetcode-cn.com/problems/reformat-the-string/
 */
public class Solution1417 {
    /**
     * 先统计
     */
    public String reformat(String s) {
        int len = s.length();
        int count = 0;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c <= '9') {
                count++;
            }
        }
        count <<= 1;
        if (Math.abs(count - len) > 1) {
            return "";
        }

        count = (count > len) ? 0 : 1;
        int letter = 1 - count;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c <= '9') {
                chars[count] = c;
                count += 2;
            } else {
                chars[letter] = c;
                letter += 2;
            }
        }
        return new String(chars);
    }


}
