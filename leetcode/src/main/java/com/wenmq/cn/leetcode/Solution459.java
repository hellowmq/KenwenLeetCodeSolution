package com.wenmq.cn.leetcode;

/**
 * Q459
 * https://leetcode-cn.com/problems/repeated-substring-pattern/
 */
public class Solution459 {
    /**
     * 长度不超过 10^4。
     * s 如果可分割，2*s 也可分割
     * 此时 2s 应当有大于 2 处匹配 s 的位置
     */
    public boolean repeatedSubstringPattern(String s) {
        return (s + s).indexOf(s, 1) != s.length();
    }

    /**
     * 学习一下别人的做法
     * 根据字符串长度的因子进行 substring
     */
    public boolean repeatedSubstringPattern2(String s) {
        int len = s.length();
        int parts = 2;
        int cur = len;
        while (cur > 1) {
            if (cur % parts == 0) {
                int k = len / parts;
                if (s.substring(0, len - k).equals(s.substring(k))) {
                    return true;
                }
                cur /= parts;
                while (cur % parts == 0) {
                    cur /= parts;
                }
            }
            parts++;
        }
        return false;
    }

}
