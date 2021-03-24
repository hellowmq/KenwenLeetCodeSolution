package com.wenmq.leetcode;

/**
 * Q205
 * https://leetcode-cn.com/problems/isomorphic-strings/
 */
public class Solution205 {
    /**
     * 桶计数法
     *
     */
    public boolean isIsomorphic(String s, String t) {
        int[] sint = new int[128];
        int[] tint = new int[128];
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (sint[chars[i]] != tint[chart[i]]) {
                return false;
            }
            sint[chars[i]] = i + 1;
            tint[chart[i]] = i + 1;
        }
        return true;
    }

    /**
     * 双向满射
     * 一一映射
     */

    public boolean isIsomorphic2(String s, String t) {
        return canMap(s, t) && canMap(t, s);
    }

    private boolean canMap(String s, String t) {
//        可以假设 s 和 t 长度相同。
//        if (s.length() != t.length()) {
//            return false;
//        }

        int[] ms = new int[128];
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            if (ms[cs[i]] == 0) {
                ms[cs[i]] = ct[i];
            } else if (ms[cs[i]] != ct[i]) {
                return false;
            }
        }

        return true;
    }

}
